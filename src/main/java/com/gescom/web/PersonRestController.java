package com.gescom.web;

import com.gescom.entities.Client;
import com.gescom.entities.Provider;
import com.gescom.models.PersonModel;
import com.gescom.services.PersonService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PersonRestController {

    final PersonService personService;

    PersonRestController(final PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/persons")
    void create(@RequestBody @Validated PersonModel personModel) {
        if(personModel.getAccountBank() != null && personModel.getRaisonSocial() != null){
            Provider provider = new Provider();
            provider.setAccountBank(personModel.getAccountBank());
            provider.setRaisonSocial(personModel.getRaisonSocial());
            provider.setName(personModel.getName());
            provider.setAddress(personModel.getAddress());
            provider.setTelephone(personModel.getTelephone());
            provider.setEmail(personModel.getEmail());

            this.personService.createProvider(provider);
        } else {
            Client client = new Client();
            client.setName(personModel.getName());
            client.setCode(personModel.getCode());
            client.setTelephone(personModel.getTelephone());
            client.setEmail(personModel.getEmail());
            client.setAddress(personModel.getAddress());

            this.personService.createClient(client);
        }
    }

    @GetMapping("persons/clients")
    List<Client> findAllClient(){
        //logic
        return this.personService.findAllClients();
    }

    @GetMapping("persons/providers")
    List<Provider> findAllProvider(){
        //logic
        return this.personService.findAllProviders();
    }
}

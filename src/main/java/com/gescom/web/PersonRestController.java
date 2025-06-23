package com.gescom.web;

import com.gescom.entities.Client;
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

    }

    List<Client> findAll(){
        return null;
    }
}

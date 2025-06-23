package com.gescom.services;

import com.gescom.entities.Client;
import com.gescom.entities.Person;
import com.gescom.entities.Provider;
import com.gescom.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private final PersonRepository repository;
    PersonServiceImpl(final PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createProvider(Provider provider) {
        this.repository.save(provider);
    }

    @Override
    public List<Provider> findAllProviders() {
        List<Provider> providers = new ArrayList<>();
        for(Person p: this.repository.findAll()){
            if(p instanceof Provider){
                providers.add((Provider) p);
            }
        }
        return providers;
    }

    @Override
    public void deletePerson(long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void editPerson(Provider provider, long id) {
        Person person = this.repository.getReferenceById(id);
        if(person instanceof Provider){
            person.setAddress(provider.getAddress());
            person.setName(provider.getName());
            person.setTelephone(provider.getTelephone());
            ((Provider) person).setAccountBank(provider.getAccountBank());
            ((Provider) person).setRaisonSocial(provider.getRaisonSocial());

            this.repository.save(person);
        }
    }

    @Override
    public void createClient(Client client) {
        this.repository.save(client);
    }

    @Override
    public List<Client> findAllClients() {
        List<Client> clients = new ArrayList<>();
        for(Person c: this.repository.findAll()){
            if(c instanceof Client){
                clients.add((Client) c);
            }
        }
        return clients;
    }

    @Override
    public void editPerson(Client client, long id) {
        Person person = this.repository.getReferenceById(id);
        if(person instanceof Client){
            ((Client) person).setBirthday(client.getBirthday());
            person.setAddress(client.getAddress());
            person.setName(client.getName());
            person.setTelephone(client.getTelephone());
            person.setEmail(client.getEmail());

            this.repository.save(person);
        }
    }
}

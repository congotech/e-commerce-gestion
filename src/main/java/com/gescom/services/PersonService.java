package com.gescom.services;

import com.gescom.entities.Client;
import com.gescom.entities.Person;
import com.gescom.entities.Provider;

import java.util.List;

public interface PersonService {

    void createProvider(Provider provider);
    List<Provider> findAllProviders();
    void deletePerson(long id);
    void editPersonProvider(Provider provider, long id);
    void createClient(Client client);
    List<Client> findAllClients();
    Provider findOneProviderById(long id);
    void editPersonCLient(Client client, long id);
    Client findOneClientById(long id);
    Person findOnePerson(long id);
}

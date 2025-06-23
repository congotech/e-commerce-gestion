package com.gescom.services;

import com.gescom.entities.Client;
import com.gescom.entities.Provider;

import java.util.List;

public interface PersonService {

    void createProvider(Provider provider);
    List<Provider> findAllProviders();
    void deletePerson(long id);
    void editPerson(Provider provider, long id);
    void createClient(Client client);
    List<Client> findAllClients();

    void editPerson(Client client, long id);
}

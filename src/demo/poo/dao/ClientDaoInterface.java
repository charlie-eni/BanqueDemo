package demo.poo.dao;

import demo.poo.entity.Client;

import java.util.List;

public interface ClientDaoInterface {

    Client save(Client client);

    Client findByName(String name);

    void removeByName(String name);

    List<Client> findAll();
}

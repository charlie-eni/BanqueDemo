package demo.poo.dao;

import demo.poo.entity.Client;

public interface ClientDaoInterface {

    Client save(Client client);

    Client findByName(String name);

    void removeByName(String name);
}

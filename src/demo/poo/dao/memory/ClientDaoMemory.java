package demo.poo.dao.memory;

import demo.poo.dao.ClientDaoInterface;
import demo.poo.entity.Client;

import java.util.*;

public class ClientDaoMemory implements ClientDaoInterface {

    private static long id;

    private final Map<Long, Client> clientMap = new HashMap<>();

    @Override
    public Client save(Client client) {
        long id = client.getId();
        if (!clientMap.containsValue(client)) {
            id = getNewId();
            client.setId(id);
        }
        clientMap.put(id, client);
        return client;
    }

    private long getNewId() {
        return ++id;
    }

    @Override
    public Client findByName(String name) {
        return clientMap.values().stream().filter(client -> client.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void removeByName(String name) {
        for (long i = 1; i <= clientMap.size(); i++) {
            if (clientMap.get(i).getName().equals(name)) {
                clientMap.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(clientMap.values());
    }

}

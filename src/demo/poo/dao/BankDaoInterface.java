package demo.poo.dao;

import demo.poo.entity.Bank;

public interface BankDaoInterface {

    Bank save(Bank bank);

    Bank getByName(String name);

    void removeByName(String name);

}

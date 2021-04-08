package demo.poo.dao.memory;

import demo.poo.entity.Bank;
import demo.poo.dao.BankDaoInterface;

import java.util.ArrayList;
import java.util.List;

public class BankDaoMemory implements BankDaoInterface {

    private final List<Bank> bankList = new ArrayList<>();

    @Override
    public Bank save(Bank bank) {
        bankList.add(bank);
        return bank;
    }

    @Override
    public Bank getByName(String name) {
        return bankList.stream().filter(bank -> bank.getName().equals(name)).findFirst().orElseThrow();
    }

    @Override
    public void removeByName(String name) {
        for (int i = 0; i < bankList.size(); i++) {
            if (bankList.get(i).getName().equals(name)) {
                bankList.remove(i);
                break;
            }
        }
    }

}

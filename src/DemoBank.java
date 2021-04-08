import demo.poo.dao.BankDaoInterface;
import demo.poo.dao.ClientDaoInterface;
import demo.poo.dao.memory.BankDaoMemory;
import demo.poo.dao.memory.ClientDaoMemory;
import demo.poo.entity.Account;
import demo.poo.entity.Bank;
import demo.poo.entity.Client;

public class DemoBank {

	public static void main(String[] args) {

		BankDaoInterface bankDao = new BankDaoMemory();
		ClientDaoInterface clientDao = new ClientDaoMemory();

		Bank banqueBnp = new Bank("bnp", "logo", 123456);
		bankDao.save(banqueBnp);

		System.out.println(banqueBnp);

		Bank banquePostale = new Bank("Poste", "logo", 1234560);
		bankDao.save(banquePostale);

		System.out.println(banquePostale);

		Client charlie = new Client("Charlie");
		clientDao.save(charlie);

		Account account = new Account(charlie, banqueBnp);

		System.out.println(clientDao.findByName("Charlie"));
		
		Bank.staticMethod();
	}
}

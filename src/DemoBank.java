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
//test2
		Bank banqueBnp = new Bank("bnp", "logo", 123456);
		bankDao.save(banqueBnp);

		System.out.println(banqueBnp);

		Bank banquePostale = new Bank("Poste", "logo", 1234560);
		bankDao.save(banquePostale);

		Bank banqueDeHacker = new Bank("Hacking", "logo", 1234560);
		bankDao.save(banquePostale);

		System.out.println(banquePostale);

		Client charlie = new Client("Charlie");
		clientDao.save(charlie);

		Client greg = new Client("Greg");
		clientDao.save(greg);

		Account charlieAccount = new Account(charlie, banqueDeHacker);
		Account gregAccount = new Account(greg, banquePostale);

		System.out.println(clientDao.findByName("Charlie"));

		System.out.println("Le haking le banque est passible d'une peinne d'amprisonnement et de plussieur millier d'euros d'amende!!");

		System.out.println("Tous les client : ");
		clientDao.findAll().forEach(System.out::println);
		clientDao.removeByName("Greg");
		System.out.println("Tous les client : ");
		clientDao.findAll().forEach(System.out::println);

		System.out.println("Don't use static method");
		
		Bank.staticMethod();
		
		System.err.println("FATAL ERREUR !!!!");
	}
}

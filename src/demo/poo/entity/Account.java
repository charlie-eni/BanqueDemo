package demo.poo.entity;

public class Account {

	private long number;
	private Client client;
	private Bank bank;

	public Account(Client client, Bank bank) {
		this.client = client;
		this.bank = bank;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}

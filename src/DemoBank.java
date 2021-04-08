import demo.poo.*;

public class DemoBank {

	public static void main(String[] args) {

		Bank banqueBnp = new Bank("bnp", "quimper", "logo", 123456);

		System.out.println(banqueBnp.toString());

		Bank banqueCic = new Bank("Cic2", "Paris", "logo", 1234560);

		System.out.println(banqueCic);
		
		Bank.staticMethod();
	}
}

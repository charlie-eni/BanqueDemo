import demo.poo.*;

public class DemoBank {

	public static void main(String[] args) {

		Bank banqueBnp = new Bank("bnp", "logo", 123456);

		System.out.println(banqueBnp.toString());

		Bank banquePostale = new Bank("Poste", "logo", 1234560);

		System.out.println(banquePostale);
		
		Bank.staticMethod();
	}
}

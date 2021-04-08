

package demo.poo;

public class Bank {

	private String name;
	private String city;
	private String logo;
	private long stockValue;

	// constructor1
	public Bank() {
	}

	public Bank(String name, String city, String logo, long stockValue) {
		super();
		this.name = name;
		this.city = city;
		this.logo = logo;
		this.stockValue = stockValue;
	}

	public String getInfos() {

		String returnValue = this.name + " " + this.city + " " + this.logo + " " + " (" + this.stockValue + ") ";
		return returnValue;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getCity() {
		return city;
	}

	private void setCity(String city) {
		this.city = city;
	}

	private String getLogo() {
		return logo;
	}

	private void setLogo(String logo) {
		this.logo = logo;
	}

	private long getStockValue() {
		return stockValue;
	}

	private void setStockValue(long stockValue) {
		this.stockValue = stockValue;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", city=" + city + ", logo=" + logo + ", stockValue=" + stockValue + "]";
	}
	
	public static void staticMethod() {
		System.out.println("hey mec");
	}
}



package demo.poo;

public class Bank {

	private String name;
	private String city;
	private String logo;
	private long stockValue;

	// constructor1
	public Bank(String name) {
		this.name = name;
	}

	public Bank(String name, String logo, long stockValue) {
		super();
		this.name = name;
		this.city = city;
		this.logo = logo;
	}

	public String getInfos() {

		String returnValue = this.name + " " + this.city + " " + this.logo + " " + " (" + this.stockValue + ") ";
		return returnValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public long getStockValue() {
		return stockValue;
	}

	public void setStockValue(long stockValue) {
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

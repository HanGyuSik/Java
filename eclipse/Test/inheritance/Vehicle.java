package Test.inheritance;

public class Vehicle {
	private String name;
	private int price;
	private int cc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	// 상속할 것
	// return super.toString()
	public String toString() {
		return name + ":" + price + ":" + cc;
	}

}

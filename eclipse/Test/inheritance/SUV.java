package Test.inheritance;

public class SUV extends Vehicle {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return super.toString() + ":" + color;

	}
	

}

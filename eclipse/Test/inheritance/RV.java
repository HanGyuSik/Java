package Test.inheritance;

public class RV extends Vehicle {
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public String toString() {
		return super.toString() + ":" + height;

	}

}

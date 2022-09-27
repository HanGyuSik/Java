package Test.inheritance;

public class Sedan extends Vehicle {
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return super.toString() + ":" + weight;

	}
}

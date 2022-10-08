package 연습장;

interface Multiply {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m1, m2;
		m1 = () -> 3.14 * 2 * 5;
		System.out.println(m1.getValue());

		m2 = () -> 10 * 3 / 5 * 6;
		System.out.println(m2.getValue());
	}
}
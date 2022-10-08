package 연습장;

interface Verify {
	boolean check(int n);
}
interface Verify2{
	boolean check(int d, int c);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.check(10));

		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
		
		Verify2 isThat = (d, c) -> (d/c) >=0;
		System.out.println(isThat.check(25, 6));
	}
}
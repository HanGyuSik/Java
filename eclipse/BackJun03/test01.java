package BackJun03;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		sc.close();
		for (int b = 1; b <= 9; b++) {
			System.out.printf("%d * %d = %d\n", a, b, a * b);
		}
	}

}

package BackJun03;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			System.out.println("케이스 입력");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("Case #%d : %d\n", i, a + b);
		}
		sc.close();
	}

}

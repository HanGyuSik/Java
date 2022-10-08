package BackJun03;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 개수");
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println("더할 수 입력");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}
		sc.close();

	}

}

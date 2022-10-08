package BackJun03;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {		// 돌아갈 횟수
			for (int j = 1; j <= i; j++) {	// 횟수마다 찍을 횟수(1-1, 2-2의 식으로)
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();

	}

}

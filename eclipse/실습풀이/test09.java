package 실습풀이;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값");
		// 입력받을 값
		int num = sc.nextInt();
		sc.close();

		// 전체 합
		int sum = 0;
		// 짝수의 합
		int a = 0;
		// 홀수의 합
		int b = 0;

		for (int i = 1; i <= num; i++) {
			// 전체 합
			sum = sum + i;

			if (i % 2 == 0) {
				// 짝수 합
				a = a + i;
			}else {
				// 홀수 합
				b = sum - a;
			}
		}
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
	}

}

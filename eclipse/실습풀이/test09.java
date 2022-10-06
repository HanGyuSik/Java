package 실습풀이;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("값을 입력하시오.");
		int num = sc.nextInt();

		int a = 0; // 짝수
		int b = 0; // 홀수

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				a += i;
			} else {
				b += i;
			}

		}
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}

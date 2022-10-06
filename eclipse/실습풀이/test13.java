package 실습풀이;

import java.util.Scanner;

public class test13 {

	public static void Cal(int a, int b) {
		int max;
		int min;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		int rem = max % min;
		for (; rem != 0;) {
			max = min;
			min = rem;
			rem = max % min;
		}
		System.out.println("최소 공배수 = " + min);
		System.out.println("최소 공배수 = " + (a * b) / min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a =");
		int a = sc.nextInt();
		System.out.println("b =");
		int b = sc.nextInt();
		
		Cal(a, b);
		sc.close();
	}

}

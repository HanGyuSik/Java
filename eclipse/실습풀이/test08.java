package 실습풀이;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력란");
		int num = sc.nextInt();
		int a = num / 50000;		// 5만원 장수
		int b = (num - (50000*a)) / 10000;		// 1만원 장수
		int c = (num - (50000*a) - (10000*b)) / 5000;		// 5천원 장수
		int d = (num - (50000*a) - (10000*b) - (5000*c)) / 1000; 	// 1천원 장수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
	}

}

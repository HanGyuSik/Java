package BackJun03;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (; true;) {
			int a = sc.nextInt(); // a라는 변수를 스캐너의 객체에 임시저장
			int b = sc.nextInt(); // b라는 변수를 스캐너의 객체에 임시저장

			if (a == 0 && b == 0) {
				sc.close();
				break;
			}
			System.out.println(a + b);
		}

	}

}

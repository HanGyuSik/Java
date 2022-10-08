package 실습풀이;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		int num = sc.nextInt();
		int tab = 0;
		
		for (int a = 2; a <= num/2; a++) {
			if(num%a == 0) {
				tab = 1;
				break;
			}

		}
		if(tab==0) {
			System.out.println("소수");
		}else {
			System.out.println("소수가 아님");
		}
		sc.close();
	}

}

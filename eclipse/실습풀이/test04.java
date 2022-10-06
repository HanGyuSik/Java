package 실습풀이;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double us = sc.nextDouble();
		int kr = (int) (us * 1350);
		
		System.out.printf("%f 는 %d입니다", us, kr);
		
		sc.close();
	}

}

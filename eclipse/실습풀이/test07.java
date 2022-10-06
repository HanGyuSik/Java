package 실습풀이;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이동시간 입력");
		int t = sc.nextInt();
		double a = 9.81;
		double v0 = 0;
		System.out.println("초기 위치 입력");
		double x0 = sc.nextDouble();
		
		double xt = x0 - (((a*t*t)/2) + (v0*t));
		
		
		System.out.println(xt);
		sc.close();
	}

}

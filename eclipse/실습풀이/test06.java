package 실습풀이;

import java.util.Scanner;

public class test06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = a*60;
		double c = b*60;
		double d = c/1224;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
	}

}

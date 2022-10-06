package 실습풀이;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원금");
		int a = sc.nextInt(); // 원금
		System.out.println("만기 년수");
		int n = sc.nextInt(); // 만기년수
		System.out.println("복리(소수)");
		double r = sc.nextDouble(); // 복리
		
		int S = (int)(a*(Math.pow((1+r), n)));
		
		System.out.println(S);
		sc.close();

	}

}

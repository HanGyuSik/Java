package Test.common;

import java.util.Scanner;

public class MaxMin01 {
	public static void REM(int num1, int num2){				// 호출할 함수, 매개변수
		int max;
		int min;
		
		if(num1 < num2) {									// 입력받는 값 크기 순서
			max = num2;
			min = num1;
		}	else {
			max = num1;
			min = num2;			
		}
//----------------------------------------------------------		
		int rem = max%min;								
		
		//while(rem!=0) {
		for(;rem!=0;) {										// while과 일치함
			max = min;										// 유클리드 호제법
			min = rem;
			rem = max%min;
		}
		System.out.println("최소 공배수 = " + min);
		System.out.println("최소 공배수 = " + (num1 * num2)/min);	
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
		REM(a, b);
	}

}

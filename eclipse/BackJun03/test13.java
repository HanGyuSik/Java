package BackJun03;

import java.util.Scanner;

public class test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입력");
		int num = sc.nextInt();		// 비교해야하는 고정값
		sc.close();
		int X = num;				//	변환하기 위한 변수
		int idx = 0;				// 반복카운트
		
		for(;true;) {
			
			//10의 자리수, 1의 자리수
			int t = X / 10;
			int k = X % 10;		// 새로운 10의 자리
			
			// 1의 자리와 10의 자리 숫자의 합
			int sum = t + k;		// 새로운 1의 자리
			
			X = k*10 + sum%10;//새로 탄생한 수
			idx++;
			if(X == num) {
				System.out.println(idx);
				break;
			}
			
		}
		
			
		
		
		
		
		
		
	}
}

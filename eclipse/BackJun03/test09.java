package BackJun03;

import java.util.Scanner;

public class test09 {		// 하나의 for문에 여러개의 for문이 들어가는 것 가능, 중첩포함

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) { 		// 행 표시
			for (int j = T; j > i; j--) { 	// 앞의 빈칸수
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {	//별 표시
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}

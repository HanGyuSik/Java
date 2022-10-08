package BackJun04;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수의 개수 입력
		System.out.println("개수 입력");
		int N = sc.nextInt();
		// 배열 선언
		int K[] = new int[N];

		for (int i = 0; i < K.length; i++) { // 배열 제작
			K[i] = sc.nextInt();
		}
		
		int min = K[0];		// 배열 첫번째 수를 임의로 최소 지정
		int max = K[0];		// 배열 첫번째 수를 임의로 최대 지정

		
		for (int i = 0; i < K.length; i++) {

			if (min > K[i]) {		// 비교 후 최소로 지정
				min = K[i];
			}

			if (max < K[i]) {		// 비교 후 최대로 지정
				max = K[i];
			}
		}
		sc.close();
		System.out.println(min + " " + max);
	}

}

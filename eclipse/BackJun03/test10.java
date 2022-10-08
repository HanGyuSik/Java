package BackJun03;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력파트부분

		System.out.println("정수의 갯수");
		int N = sc.nextInt();

		System.out.println("비교값");
		int X = sc.nextInt();
		// 배열
		int[] t = new int[N];
		
		// t 배열의 칸수에 해당하는 int값, 카운트
		int idx = 0;

		// 수열 입력반복
		for (int i = 0; i < N; i++) {

			// 수열 입력
			int K = sc.nextInt();

			// 들어온 값과 X를 비교
			if (K < X) {
				t[idx++] = K;		// 배열에 K값을 분배
			}
		}
		sc.close();

		// ----------------------------
		
		for (int i = 0; i < idx; i++) {
			System.out.print(t[i] + "\t");
		}
	}

}

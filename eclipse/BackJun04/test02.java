package BackJun04;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력");
		// 배열의 갯수
		int N = sc.nextInt();
		// 카운트
		int idx = 0;

		// 배열 선언 및 제작
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		// --------------------------------------------
		// 임의의 배열 최댓값
		int m = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (m < arr[i]) {
				m = arr[i];
				idx = i;		// 여기까지 왔다 = 최대기록 갱신 : 갱신한 배열번호
			}
		}
		System.out.println(m + " " + (idx+1));	// i = 0부터 시작

	}

}

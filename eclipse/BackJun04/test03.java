package BackJun04;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력");
		int num = sc.nextInt(); // 배열 갯수 선언
		int arr[] = new int[num]; // 배열 선언
		
		System.out.println("나누기할 숫자");
		int b = sc.nextInt(); // 나누기 할 숫자
		int idx = 0; // 나머지 카운트

		// --------나머지로 이루어진 배열----------------
		
		System.out.println("배열 구성원");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % b;
		}
		sc.close();

		boolean bl; // n번째와 n+1번째의 나머지 비교
		for (int i = 0; i < arr.length; i++) { // n번째 라인
			bl = false; // 다르다로 설정

			for (int j = i + 1; j < arr.length; j++) { // n+1번째 라인

				if (arr[i] == arr[j]) { // i의 나머지와 j의 나머지가 같다면
					bl = true;
					break;
				}

			}
			if (bl == false) {
				idx++;
			}
		}
		System.out.println(idx);
	}
}

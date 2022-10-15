package BackJun04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("For문을 사용");
		System.out.println("입력");
		int N1 = sc1.nextInt();

		int arr1[] = new int[N1];

		for (int i = 0; i < N1; i++) {
			arr1[i] = sc1.nextInt();
		}

		int min = arr1[0];
		int max = arr1[0];
		for (int i = 0; i < N1; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			}
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println(min + ":" + max);

// =============================================================

		System.out.println("While문 사용");
		System.out.println("입력");
		int N2 = sc1.nextInt();

		int arr2[] = new int[N2];
		int a = 0;
		System.out.println("숫자 입력");
		while (a < arr2.length) {
			arr2[a] = sc1.nextInt();
			a++;
		}
		// a값이 최대를 찍었으므로 재사용 불가
		sc1.close();
//		System.out.println(Arrays.toString(arr2));
		int min2 = arr2[0];
		int max2 = arr2[0];
		
		int b = 0;
		while (b < arr2.length) {
			if (min2 > arr2[b]) {
				min2 = arr2[b];
			}
			
			if (max2 < arr2[b]) {
				max2 = arr2[b];
			}
			b++;

		}
		System.out.println(min2 + ":" + max2);

	}

}

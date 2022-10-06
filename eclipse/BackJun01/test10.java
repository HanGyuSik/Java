package BackJun01;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 2, 8 };
		Scanner sc = new Scanner(System.in);
		int b[] = new int[6];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			System.out.print(a[i] - b[i] + " ");
		}
		sc.close();
	}
}

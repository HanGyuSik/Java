package 실습풀이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int num = sc.nextInt();
//		int []arr = new int[40];
		List<Integer> list = new ArrayList<>();

		for (; num > 0;) {
			list.add(num % 2);
			num = num / 2;
		}
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		sc.close();
	}

}

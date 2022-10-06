package 실습풀이;

import java.util.Scanner;

public class test15 {

	public void grade(int a) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a >= 95) {
			System.out.println("A+");
		} else if (a >= 90) {
			System.out.println("A");
		} else if (a >= 85) {
			System.out.println("B+");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 75) {
			System.out.println("C+");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 65) {
			System.out.println("D+");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		sc.close();
	}

}

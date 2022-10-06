package 실습풀이;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도형을 선택하세요");
		
		int a = sc.nextInt();
		
		if(a == 3) {
			System.out.println("밑변");
			int b = sc.nextInt();
			System.out.println("높이");
			int c = sc.nextInt();
			
			System.out.printf("밑변 : %d, 높이 : %d, 면적 : %d\n", b, c, (b*c)/2);
		} else if(a==4) {
			System.out.println("밑변");
			int b = sc.nextInt();
			System.out.println("높이");
			int c = sc.nextInt();
			
			System.out.printf("밑변 : %d, 높이 : %d, 면적 : %d\n", b, c, (b*c));
		}else {
			System.out.println("삼각형과 사각형중 선택해주세요.");
		}
		sc.close();
	}

}

package edu.반복문;

public class TestEx01 {

	public static void main(String[] args) {

//-----------------구구단 초안---------------------------

		int dan = 3; // 원하는 단 입력

		for (int i = 2; i < 10; i += dan) { // 앞부분 숫자와 줄변경했을때의 dan수
			for (int j = 1; j < 10; j++) { // 곱할 숫자 증가
				for (int k = 0; k < dan; k++) { // dan과 연관된 변수, k가 증가함에 따라 줄 변경 선택

					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);

					if (k < dan - 1) // dan의 수와 비교하여 줄을 바꿀것인지 탭을 할지 선택
						System.out.print("\t");
					else
						System.out.print("\n");
				}
			}
			System.out.print("\n");
		}
	}
}

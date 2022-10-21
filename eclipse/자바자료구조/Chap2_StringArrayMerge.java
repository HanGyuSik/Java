package 자바자료구조;

import java.util.Arrays;

public class Chap2_StringArrayMerge {

	public static void main(String[] args) {
		String s1[] = { "홍길동", "강감찬", "을지문덕", "계백", "김유신" };
		String s2[] = { "독도", "울릉도", "한산도", "영도", "우도" };

		// 배열 정렬
		Arrays.sort(s1);
		Arrays.sort(s2);

		// 재정렬 후 출력
		System.out.print("s1 = ");
		for (String t : s1) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.print("s2 = ");
		for (String t : s2) {
			System.out.print(t + " ");
		}
		// ----------------------------------------------
		// 새로운 배열 생성
		String s3[] = new String[15];
		// 배열 합
		int i = 0;	// s1의 배열번호
		int j = 0;	// s2의 배열번호
		int k = 0;	// s3의 배열번호
		while (i < s1.length && j < s2.length) {
			// s1의 문자열이 더 작을 경우
			if (s1[i].compareTo(s2[j]) < 0) {
				s3[k] = s1[i];	// s3에 대입
				k++;			// k값 증가
				i++;			// i값 증가
			} else if (s1[i].compareTo(s2[j]) > 0) {
				s3[k] = s2[j];
				k++;
				j++;			// j값 증가
			} else {			// 
				s3[k] = s1[i];
				k++;
				i++;
				j++;
			}
		}

		// 남은 자투리 처리

		while (i < s1.length) {
			s3[k] = s1[i];
			k++;
			i++;
		}
		while (j < s2.length) {
			s3[k] = s2[j];
			k++;
			j++;
		}
		System.out.println();
		System.out.println("s3 : ");
		for (String t : s3) {
			System.out.print(t + " ");
		}

	}

}

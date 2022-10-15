package BackJun04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//class Test_1 {
//	
//	// for, 배열
//	int count; // 카운트
//	boolean fal; // 값이 다른경우
//
//	// input 받은 값 배열화
//	public int[] Fall() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("N입력");
//		int N = sc.nextInt();
//
//		int arr[] = new int[N];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		return arr;
//	}
//
//	public void process(int ar[]) {
//		int ar1[] = new int[ar.length];
//		for (int i = 0; i < ar.length; i++) {
//			ar1[i] = (ar[i] % 42);
//		}
//		System.out.println(Arrays.toString(ar1));
//		// 나머지값 배열화
//		int count = 0;
//		boolean fal;
//		
//		for (int i = 0; i < ar1.length; i++) {
//			fal = false;
//			for(int j = i+1; j < ar1.length; j++) {
//				if(ar1[i] == ar1[j]) {
//					fal = true;
//					break;		// 겹치는 앞부분 전부 제거
//				}
//			}
//			if(fal == false) {
//				count++;
//			}
//		}
//		this.count = count;
//	}
//
//	public void print() {
//		System.out.println(count);
//	}
//}

class Test_2 {
	int size;

	// input
	public int[] Tell() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc1.nextInt();

		int arr2[] = new int[num];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc1.nextInt();
		}
		sc1.close();
		return arr2;
	}

	// process
	public void pro(int ar2[]) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < ar2.length; i++) {
			list.add((ar2[i] % 42));
		}
		System.out.println(Arrays.toString(ar2)); // 배열 출력
		System.out.println(list); // list출력

//		List<Integer> list1 = new ArrayList<>(); // 중복 제거한 리스트
//		for (int i = 0; i < list.size(); i++) {		// 1번쩨 contains사용
//			if (!list1.contains(list.get(i))) {
//				list1.add(list.get(i));
//			}
//		}
		
		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
		// Stream 사용
		int size = list1.size();
		this.size = size;
	}

	public void pnt() {
		System.out.println(size);
	}

}
//==============================================================

public class Test03 {

	public static void main(String[] args) {
//		Test_1 te = new Test_1();
//		int ar[] = te.Fall();
//		te.process(ar);
//		te.print();

		Test_2 tes = new Test_2();
		int ar2[] = tes.Tell();
		tes.pro(ar2);
		tes.pnt();
	}

}

package BackJun04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//class Recall01 {
//	int cont;
//	int max;
//	//input
//	public int[] get() {
//		Scanner sc = new Scanner(System.in); // 스캐너 입력
//		System.out.println("정수 입력");
//		int N = sc.nextInt();
//
//		int arr[] = new int[N];
//		// 배열 생성
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		return arr;
//	}
//
//	//process
//	public void cal(int arr[]) {
//		int cont = 0;
//		// 최댓값의 위치
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//				cont = i + 1; // cont의 배열위치 + 1 ; 배열스타트가 0이므로
//			}
//		}
////		System.out.println(cont);
////		System.out.println(max);
//		this.cont = cont;
//		this.max = max;
//	}
//
//	//output
//	public void print() {
//		System.out.println(cont);
//		System.out.println(max);
//	}
//
//}
//=============================================================

class Recall02 {
	int count;
	int Max;
	int idx;
	// 전역변수
	
	// input // 리스트 + 정수
	public List<Integer> Ral() {		// List<Integer> : 리턴타입
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수 입력");
		int N2 = sc1.nextInt();
		
		List<Integer> list = new ArrayList<>();
		System.out.println("값 입력");
		for(int i = 0; i < N2; i++) {
			list.add(sc1.nextInt());	
		}
		sc1.close();
		return list;		
	}
	
	// List<> : 클래스(객체)타입 입력; Object의 상속을 받는 모든 객체 가능
	public void process(List<Integer> LL) { 
		int Max = Collections.max(LL);
//		List.of(LL);
		int count = Max;	// 찾고자 하는 값
		int idx = LL.indexOf(count);	// 찾고자하는 값의 순서를 찾는 함수
		this.Max = Max;
		this.count = count;
		this.idx = idx;
	}
	
	// output
	public void print2() {
		System.out.println(Max);
		System.out.println(idx+1);
	}
}

//=============================================================

public class Test02 {

	public static void main(String[] args) {
//		Recall01 re = new Recall01(); // Recall 클래스 객체
//		int arr2[] = re.get();	// arr2 : 함수호출 후 값 리턴받아 저장
//		re.cal(arr2);
//		re.print();

		
		Recall02 ra = new Recall02();
		List<Integer> LL = ra.Ral();
		ra.process(LL);
		ra.print2();
		
	}

}

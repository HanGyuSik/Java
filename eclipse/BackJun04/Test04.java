package BackJun04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class Test_01 {
//	double answer;
//
//	public int[] input() {
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("시험 개수");
//		int N = sc1.nextInt();
//
//		int arr1[] = new int[N];
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc1.nextInt();
//		}
//		System.out.println(Arrays.toString(arr1));
//		sc1.close();
//		return arr1;
//	}
//
//	public void process(int A[]) {
//		
//		System.out.println(Arrays.toString(A));
//		int max = A[0];
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] > max) {
//				max = A[i];
//			}
//			System.out.println(max);
//		}
//		
//		int sum = 0;
//		for (int i = 0; i < A.length; i++) {
//			sum += A[i];
//		}
//		System.out.println(sum);
//		
//		double answer = (double)(sum*100)/(A.length*max);
//		this.answer = answer;
//
//	}
//
//	public void output() {
//		System.out.println(answer);
//	}
//
//}
class Test_02 {
	double t;
	
	public List<Integer> in() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("시험 개수");
		int n = sc2.nextInt();
		int a = 0;

		List<Integer> list = new ArrayList<>();
		while (a < n) {
			list.add(sc2.nextInt());
			a++;
		}
		System.out.println(list);
		sc2.close();
		return list;
	}

	public void pro(List<Integer> K) {
		int max1 = K.get(0);
		for(int i = 0; i < K.size(); i++) {
			if(max1 < K.get(i)) {
				max1 = K.get(i);
			}
		}
		
		int sum1 = 0;
		for (int i = 0; i < K.size(); i++) {
			sum1 += K.get(i);
		}
		double t = (double)(sum1*100)/(max1*K.size());
		this.t = t;
	}
	
	public void pr() {
		System.out.println(t);
	}
}

public class Test04 {

	public static void main(String[] args) {
//		Test_01 test = new Test_01();
//		int A[] = test.input();
//		System.out.println(Arrays.toString(A));
//		test.process(A);
//		test.output();

		Test_02 test1 = new Test_02();
		List<Integer> K = test1.in();
		test1.pro(K);
		test1.pr();

	}

}

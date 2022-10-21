package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chap1_merge_assignment_StringArray {
	// removeElement(주어진 값, 제거할 요소)
	public static String[] removeElement(String[] arr, String item) {
		/*
		 * ArraysList ; asList ; method <> ; data type Arrays ; class list ; 변수 List ;
		 * inteface, 자식 remove ; boolean 인터페이스 상속받은 변수 = 객체; 함수의 파라미터(Arrays클래스 내의
		 * asList함수(파라미터;arr))
		 * 
		 */
		List<String> list = new ArrayList<>(Arrays.asList(arr)); // 임의의 객체로 list 지정
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static String[] removeDuplicate(String[] st) {
		// 파리미터값만큼 반복할 횟수
		int count = st.length;
		// i = st1의 배열 초반부(0부터)
		for (int i = 0; i < count; i++) {
			int j = i + 1;
			while (j < count) {
				if ((st[i].compareTo(st[j])) == 0) {
					st = removeElement(st, st[j]);
					count--;
//					System.out.println("j = " + j + "count = " + count);
				} else
					j++;

			}
		}
		return st;
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");
		list1.add("서울");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울성동구");
		list2.add("서울");
		list2.add(1, "LA");

		//
		// list1 정렬
		System.out.println("collection.sort()::");
		Collections.sort(list1); // list1 정렬
		System.out.println("list1::");
		for (String city : list1)
			System.out.print(city + " ");

		// list2 정렬
		System.out.println();
		System.out.println("list2::");
		Collections.sort(list2);
		for (String city : list2)
			System.out.print(city + " ");

		// list1 담을 배열
		String[] st1 = new String[0];
		st1 = list1.toArray(st1);
		// list2 담을 배열
		String[] st2 = new String[0];
		st2 = list2.toArray(st2);

		System.out.println();
		System.out.println("=========================================");

		st1 = removeDuplicate(st1);
		st2 = removeDuplicate(st2);

		for (String ct : st1) {
			System.out.print(ct + "  ");
		}
		System.out.println();

		for (String cr : st2) {
			System.out.print(cr + "  ");
		}
		System.out.println();
		

		// -----------------------------------------------------------
		String[] st3 = new String[20];
		
		
		int si = 0; // st1 순서
		int sj = 0; // st2 순서
		int k = 0; // st3 순서
		// 작은값이 순서대로 st3에 들어간다.		
		
		while (si < st1.length && sj < st2.length) { // 하나의 배열이 오링날 때까지
				
			si = si +1;
			if ((st1[si].compareTo(st2[sj])) < 0) { //
				st3[k] = st1[si];
				k++;
				si++;
				
			} else if ((st1[si].compareTo(st2[sj])) > 0) {
				st3[k] = st2[sj];
				k++;
				sj++;
				
			}else {
				st3[k] = st1[si];
				k++;
				si++;
			}
			
		}
		
		while(si < st1.length) {
			st3[k] = st1[si];
			k++;
			si++;
		}
		while(sj < st2.length) {
			st3[k] = st2[sj];
			k++;
			sj++;
		}
			//System.out.println(Arrays.toString(st3));
		System.out.println("st3  = :: ");
			for (String city : st3)
				System.out.print(city + " ");
//		while(i < st1.length) {
//			
//		}
//
//		while(j < st1.length) {
//			
//		}
//		
		
//		List<String> list01 = new ArrayList<String>(Arrays.asList(st1));
//		List<String> list02 = new ArrayList<String>(Arrays.asList(st2));
//		
//		list01.addAll(list02);
//		
//		Collections.sort(list01);
//		String[] st3 = list01.toArray(new String[0]);
//			
//		System.out.println(Arrays.toString(st3));

//		ArrayList<String> list3 = new ArrayList<String>();
//
//		Iterator<String> iter1 = list1.iterator(); // 재설명요청
//		Iterator<String> iter2 = list2.iterator();
//
//		System.out.println();
//		System.out.println("merge:: ");
//		for (String city : list3)
//			System.out.print(city + " ");

	}
}

package 자바자료구조;

import java.util.*;

import 다른분들_답안.Fruit;

//class Fruit implements Comparable<Fruit> {
//	private String name;
//	private int price;
//
//	Fruit(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
//
//	@Override // Comparable 안의 toString을 오버라이딩하여 값의 출력을 보조
//	public String toString() {
//		return "<" + name + ", " + price + "> ";
//	}
//
//	@Override
//	// if문의 경우 같다는 조건을 마지막에 정리하여 같을경우의 차이도 구분하기 쉽게 한다.
//	public int compareTo(Fruit o) { // 들어온 인자값을 비교
//		if (this.price < o.price) {
//			return -1;
//		} else if (this.price > o.price) {
//			return 1;
//		} else if (this.price == o.price) {
//			if (this.name.compareTo(o.name) < 0) {
//				return -1;
//			} else if (this.name.compareTo(o.name) > 0) {
//				return 1;
//			}
//		}
//		return 0;
//	}
//
//}

public class Chap3_ObjectArraySort {
	public static void main(String[] args) {
//	String[] s = { "sort", "string", "array" };
//	Arrays.sort(s);
//	Arrays.sort(s, Comparator.naturalOrder());
//	Arrays.sort(s, Comparator.reverseOrder()); 

		/*
		 * Arrays.sort(s, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o2.compareTo(o1);
		 * // 내림차순으로 정렬 } });
		 */
//	s = Arrays.stream(s).sorted().toArray(String[]::new);	
//	s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
//	Collections.sort(Arrays.asList(s));
		Fruit[] arr = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
				new Fruit("수박", 880), new Fruit("체리", 10) };
		System.out.println();
		System.out.println("정렬전::");

//		System.out.println(Arrays.toString(arr));	// 자바가 직접잡아주는 틀

		for (Fruit f : arr) {
			System.out.print(" " + f); // 본인이 임의의 틀로 지정하기 위해
		}

//	Arrays.sort(arr);
//구현 - 정렬
		Arrays.sort(arr); // 배열 정렬, Collections : 리스트 정렬
		System.out.println();
		System.out.println("정렬후::");
		for (Fruit city : arr) {
			System.out.print(" " + city);
		}

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();
		lst2.add(new Fruit("복숭아", 200));
		lst2.add(new Fruit("포도", 300));
		lst2.add(new Fruit("참외", 100));
		lst2.add(new Fruit("딸기", 50));
		lst2.add(new Fruit("블루베리", 500));
		lst2.add(new Fruit("구지뽕", 300));
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);
//    Arrays.sort(lst2);
		Collections.sort(lst2);
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);

		System.out.println();

		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();

		Iterator<Fruit> iter1 = lst1.iterator();
		Iterator<Fruit> iter2 = lst2.iterator();

		Fruit st1 = iter1.next(); // 객체에 관해서 iter을 지정하는 것.
		Fruit st2 = iter2.next(); // iterator의 경우 값을 리턴하며 옮겨가기 때문에 값을 담을 변수가 필요

		while (iter1.hasNext() && iter2.hasNext()) {
			if (st1.compareTo(st2) < 0) {
				lst3.add(st1);
				st1 = iter1.next();
			} else if (st1.compareTo(st2) > 0) {
				lst3.add(st2);
				st2 = iter2.next();
			} else {
				lst3.add(st1);
				st1 = iter1.next();
				st2 = iter2.next();
			}
		}

		while (iter1.hasNext()) {
			lst3.add(st1);
			st1 = iter1.next();
		}
		while (iter2.hasNext()) {
			lst3.add(st2);
			st2 = iter2.next();
		}

		System.out.println(lst3);
//구현- merge를 iterator 사용

//		System.out.println();
//		System.out.println("merge:: ");
//		for (Fruit city : lst3)
//			System.out.print(city + " ");
//		Fruit newFruit = new Fruit("참외", 100);
//		// binary search - Comparator를 사용한 구현
//
//		System.out.println();
//		if (Collections.binarySearch(lst3, newFruit, cc) < 0)
//			System.out.println("조회결과 없다");
//		else
//			System.out.println("조회 결과 " + newFruit);

	}
}

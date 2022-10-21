//package 자바자료구조;
//
//import java.util.*;
//
//class Fruit implements Comparable<Fruit> { // comparable : 객체정렬을 위한 인터페이스
//	private String name;
//	private int price;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public Fruit(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
//
//	public int compareTo(Fruit ft) { // comparable은 compareTo(<T> e)로 구현. e : 객체 내의 오는 인자.
//		if (this.price < ft.price) {
//			return -1;
//		} else if (this.price > ft.price) {
//			return 1;
//		} else if (this.price == ft.price) {
//			if ((this.name.compareTo(ft.name)) < 0) {
//				return -1;
//			} else if ((this.name.compareTo(ft.name)) > 0) {
//				return 1;
//			}
//		}
//		return 0;
//	}
//
//	public String toString() {
//		return "<" + name + ", " + price + "> ";
//	}
//
//}
//
//public class ComparableMethod {
//	public static void main(String[] args) {
////		System.out.println("======스트링::");
////		String[] s = { "sort", "string", "array" };
//////	Arrays.sort(s);
////	Arrays.sort(s, Comparator.reverseOrder()); 
//
////	Arrays.sort(s, new Comparator<String>() {
////	    @Override
////	    public int compare(String o1, String o2) {
////	        return o2.compareTo(o1);            // 내림차순으로 정렬
////	    }
////	});
//
////		Collections.sort(Arrays.asList(s));// s[]의 주소를 lst에서 사용하므로 변경됨
////		for (String fr : s)
////			System.out.print(" " + fr);
////		System.out.println();
////		
////		
////		List<String> lst = Arrays.asList(s);
////		for (String city : lst)
////			System.out.print(" " + city);
//
////	s = Arrays.stream(s).sorted().toArray(String[]::new);	
////	s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
//		System.out.println();
//		System.out.println("======객체::");
//		Fruit[] arr = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
//				new Fruit("수박", 880), new Fruit("체리", 10) };
//
////		Arrays.sort(arr);
//		Arrays.sort(arr, new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
//				return o2.compareTo(o1); // 내림차순으로 정렬
//			}
//		});
//
//		for (Fruit city : arr)
//			System.out.print(" " + city);
//		System.out.println();
//
//		System.out.println("=====람다식(가격순)::");
//		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // Fruit에 compareTo()가 있어도 람다식 우선 적용
//
//		for (Fruit city : arr)
//			System.out.print(" " + city);
//
//		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
//		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();
//		lst2.add(new Fruit("복숭아", 200));
//		lst2.add(new Fruit("포도", 300));
//		lst2.add(new Fruit("참외", 100));
//		lst2.add(new Fruit("딸기", 50));
//		lst2.add(new Fruit("블루베리", 500));
//		lst2.add(new Fruit("구지뽕", 300));
//		System.out.println();
//		System.out.println("새로운 리스트2::");
//		for (Fruit city : lst2)
//			System.out.print(" " + city);
////    Arrays.sort(lst2);
//		Collections.sort(lst2);
//		System.out.println();
//		System.out.println("리스트 재정렬(이름순)::");
//		for (Fruit fr : lst2)
//			System.out.print(" " + fr);
//
//		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();
//
//		Iterator<Fruit> iter1 = lst1.iterator();
//		Iterator<Fruit> iter2 = lst2.iterator();
//		Fruit d1 = iter1.next();
//		Fruit d2 = iter2.next();
//
//		
//		
//		
//
//		System.out.println();
//		System.out.println("merge:: ");
//		for (Fruit city : lst3)
//			System.out.print(city + " ");
//		Fruit newFruit = new Fruit("참외", 100);
//
//		// binary search
//		Comparator<Fruit> cc = new Comparator<Fruit>() {
//			public int compare(Fruit u1, Fruit u2) {
//				return u1.compareTo(u2);
//			}
//		};
//
//		System.out.println();
//		int result = Collections.binarySearch(lst3, newFruit, cc);
//		System.out.println("조회결과 exist  " + result);
//
//	}
//}

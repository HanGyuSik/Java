package Professor;

import java.util.*;

public class ComparableMethod {
	
	public static Fruit nextelement(Iterator<Fruit> iter) {
		try {
			return iter.next();
		}catch(Exception e) {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("==========객체: 첫번째 배열==========");
		Fruit arr[] = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
				new Fruit("수박", 880), new Fruit("체리", 10) };

//		Arrays.sort(arr);	// 배열을 기본적인 설정값대로 정렬

		Arrays.sort(arr, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) { // 들어온 인자 2개를 비교함.
				return o1.compareTo(o2); // 오름차순, 내림차순의 경우 o2.compareTo(o1)
			} // Arrays.sort(정렬하고자 하는 배열, 정렬을 시킬 기준 객체(comparator)
		});
		System.out.println();
//		System.out.println(arr.toString()); // 이렇게 하면 [D@46a49e6] 같은 값(주소)이 나옴
//		System.out.println(Arrays.toString(arr)); // 자바에서 공급해주는 기본적인 배열 출력식

		for (Fruit fr : arr) { // 배열에서 원소 추출
			System.out.print(" " + fr);
		}
		System.out.println();

		// =================================================================================

//		System.out.println("==============람다식 전환 : 가격순============");
//		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // 배열을 뒤따라오는 식대로 정렬
//		System.out.println();
//
//		for (Fruit fr : arr) {
//			System.out.print(" " + fr);
//		}
//		System.out.println();

		// ==================================================================================

		ArrayList<Fruit> list1 = new ArrayList<Fruit>(Arrays.asList(arr)); // 첫번째 객체배열을 리스트로 전환
		ArrayList<Fruit> list2 = new ArrayList<Fruit>(); // 두번째 리스트를 생성
		list2.add(new Fruit("복숭아", 200));
		list2.add(new Fruit("포도", 300));
		list2.add(new Fruit("참외", 100));
		list2.add(new Fruit("딸기", 50));
		list2.add(new Fruit("블루베리", 500));
		list2.add(new Fruit("구지뽕", 300));
		System.out.println();
		System.out.println("=================새로운 리스트2::====================");
		for (Fruit fr : list2) {
			System.out.print(" " + fr);
		}
		System.out.println();
//		Arrays.sort(list2);		// 배열이 아니므로 실행 불가		
		Collections.sort(list2); // 두번째 리스트 정렬 : 기본으로 제공되는 정렬방법(이름순)
		System.out.println();

		// =======================================================================

		System.out.println("=============리스트2 정렬 후::================");
		for (Fruit fr : list2) {
			System.out.print(" " + fr);
		}
		System.out.println();

		// ==========================================================

		ArrayList<Fruit> list3 = new ArrayList<Fruit>(); // 두 리스트를 합쳐줄 리스트

		// Iterator : 인터페이스로 주어진 리스트 내부를 반복하여 순회한다.
		// Iterator와 for문의 차이 : 순회하며 수정 및 삭제 가능성의 유무
		// hasNext() : 뒤에 원소가 있는지 유무 판단, next() : 다음원소로 이동, hasPrevious, previous = 역순
		Iterator<Fruit> iter1 = list1.iterator();
		Iterator<Fruit> iter2 = list2.iterator();


		// 최초 데이터 설정
		Fruit da1 = iter1.next();
		Fruit da2 = iter2.next();
		while(true) {
		
			// da1이 da2보다 작으면 list3에 추가
			if (da1.compareTo(da2) < 0) {
				list3.add(da1); // list3에 1값 추가
				
				// iter1의 다음 객체를 설정 없으면 null이 리턴되어 옴.
				da1 = nextelement(iter1);
				if (da1 == null) break;
			}
			// da2가 da1보다 작으면 list3에 추가
			else if (da1.compareTo(da2) > 0) {
				list3.add(da2); // list3에 1값 추가

				// iter2의 다음 객체를 설정 없으면 null이 리턴되어 옴.
				da2 = nextelement(iter2);
				if (da2 == null) break;
			}
			// 두개의 값이 똑같을 경우 da1을 추가
			else {
				// 두개가 같은 값이므로 둘다 증가시켜준다.
				list3.add(da1);

				// iter1의 다음 객체를 설정 없으면 null이 리턴되어 옴.
				da1 = nextelement(iter1);
				if (da1 == null) break;

				// iter2의 다음 객체를 설정 없으면 null이 리턴되어 옴.
				da2 = nextelement(iter2);
				if (da2 == null) break;
			}
		}
		
		// hasNext로 이동 끝난 후 나머지 처리
		if (da1 != null) {
			while(true) {
				list3.add(da1);
				da1 = nextelement(iter1);
				if (da1 == null) break;
			}
		}

		if (da2 != null) {
			while(true) {
				list3.add(da2);
				da2 = nextelement(iter2);
				if (da2 == null) break;
			}
		}

		System.out.println();

		// ============================================================

		System.out.println("==========merge:: ===============");
		for (Fruit city : list3) {
			System.out.print(city + " ");
		}
		Fruit newFruit = new Fruit("참외", 100);

		// binary search
		// comparator : 인터페이스로 필수적으로 public int compare(o1, o2)를 구현
		// 그 이외의 메소드들은 default와 static은 구현X, boolean은 object클래스에서 정의되어 있음.
		Comparator<Fruit> cc = new Comparator<Fruit>() {
			public int compare(Fruit u1, Fruit u2) {
				return u1.compareTo(u2);
			}
		};
		System.out.println();
		int result = Collections.binarySearch(list3, newFruit, cc);
		System.out.println("조회결과 exist  " + result);

	}
}
package 자바자료구조;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Chap1_merge_assignment_String_List {
	public void removeElement(Iterator<String> iter) {

	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add(1, "LA");

		//
		System.out.println("collection.sort()::");
		Collections.sort(list1);
		System.out.println("list1::");
		for (String city : list1)
			System.out.print(city + " ");

		System.out.println();
		System.out.println();

		System.out.println("list2::");
		Collections.sort(list2);
		for (String city : list2)
			System.out.print(city + " ");

//=========================================================================
		// 리스트 3 제작
		ArrayList<String> list3 = new ArrayList<String>();

		Iterator<String> iter1 = list1.iterator(); // iterator 정의
		Iterator<String> iter2 = list2.iterator();
		// 메서드는 다음 요소가 있는지 판단하는 hasNext(), 다음 요소를 가져오는 next(), 가져온 요소를 삭제하는 remove()
		System.out.println();

		String st1 = iter1.next();
		String st2 = iter2.next();

		while (iter1.hasNext() && iter2.hasNext()) {// 뒤로 이동이 가능할 때
			
			if (st1.compareTo(st2) < 0) { // st1과 st2를 비교하여 작은것을 list3에 추가
				list3.add(st1);
				st1 = iter1.next();
			} else if (st1.compareTo(st2) > 0) {
				list3.add(st2);
				st2 = iter2.next();
			} else {
				list3.add(st1);
				st1 = iter1.next();
				st2 = iter2.next();
			}
		}
		
		while(iter1.hasNext()) {
			list3.add(st1);
			st1 = iter1.next();
		}
		while(iter2.hasNext()) {
			list3.add(st2);
			st2 = iter2.next();
		}
			
		System.out.println();
		System.out.println("merge:: ");
		for (String city : list3)
			System.out.print(city + " ");

	}
}

package 연습장;

import java.util.Arrays;

interface MyFunc<T> {
	T modify(T t);
}

public class Test06 {

	public static void main(String[] args) {
//		int b =10;
//		Integer obj = 10;
//		int v[] = {1,2,3,4};
//		Arrays.stream(v);
		
		
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		MyFunc<Integer> mf2 = (n) -> n * 2;
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}
}
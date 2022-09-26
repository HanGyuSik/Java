package com.ruby.java.ch06;

	class Count {
		public static int totalCount;
		int count;
	}

	public class CountTest {
		public static void main(String[] args) {
			Count.totalCount = 10;
			
			Count c1 = new Count();
			Count c2 = new Count();
			Count c3 = new Count();
			
	
			c1.count++;
			Count.totalCount++;
			System.out.println(Count.totalCount + " : " + c1.count);
			c2.count++;
			Count.totalCount++;
			System.out.println(Count.totalCount + " : " + c2.count);
			c3.count++;
			Count.totalCount++;
			System.out.println(Count.totalCount + " : " + c3.count);
			
		}

}

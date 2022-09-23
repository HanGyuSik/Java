package com.ruby.java.ch06;

//public class StaticMethodTest {
//
//	public static void main(String[] args) {
//		
//		StaticMethodTest.print1();
//		print1();
//		StaticMethodTest s = new StaticMethodTest();
//		s.print2();
//	}
//
//	public static void print1() {
//		System.out.println("hello");
//	}
//
//	public void print2() {
//		System.out.println("java");
//	}
//
//}

public class StaticMethodTest {
	int num = 123;
	public static void main(String[]args) {
		StaticMethodTest.print1();
		StaticMethodTest exm = new StaticMethodTest();
		exm.print2();
	}
	public static void print1() {
	//	int num2 = num;
		System.out.println("hello");
	}
	
	public static void print2() {
	//	int num3 = num;
		System.out.println("java");
	}
}
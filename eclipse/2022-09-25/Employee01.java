package com.ruby.java.ch06;

class KLKL{		// public가 안붙을 경우 class 갯수 자유. 단, 타 패키지에서 사용 불가
	private String name;
	private int age;
	private String dept;
	
	public String getName() {					// 지정값을 받음
		return name;
	}
	
	public void setName(String name) {			// 지정값을 부여받는 장소
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
}
public class Employee01 {
	private String name;
	private int age;
	private String dept;
	
	public String getName() {					// 지정값을 받음
		return name;
	}
	
	public void setName(String name) {			// 지정값을 부여받는 장소
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employee01 e= new Employee01();			// 함수 호출 = 객체필요
		e.setAge(10);							// 지정값 부여
		System.out.println("age = " + e.getAge());
		System.out.println();
		e.age = 9;
		Student01 t = new Student01();
		t.setName("Talde");
		System.out.println(t.getName());
		

	}

}

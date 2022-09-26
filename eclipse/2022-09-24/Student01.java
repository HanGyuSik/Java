package com.ruby.java.ch06;

public class Student01 {		// 접근성(공용), public class파일은 파일명과 동일하므로 중복 불가
	private String name;
	private int age;
	private String dept;

	public String getName() { // 지정값을 받음
		return name;
	}

	public void setName(String name) { // 지정값을 부여받는 장소
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

package edu.상속;

public class Person {					// 부모가 되는 클래스
	private String name; 			
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	public Person() {
		System.out.println("#Person 생성자");
	}
	
	
	

}

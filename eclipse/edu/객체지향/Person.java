package edu.객체지향;
public class Person {

	private String name;
	private int year;
	
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		p.setName("홍길동");
//		p.setYear(1100);
//
//		System.out.println("Info:" + p.toString());
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", year=" + year + "]";
	}	
}

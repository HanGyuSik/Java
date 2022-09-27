package edu.상속;

public class Student extends Person {

	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
//		return this.getName() + ":" + this.getAge() + ":" + major;
		return super.toString() + ":" + major;
	}

	public Student() {
		System.out.println("#Student 생성자");
	}
}

package edu.상속;

public class Professor extends Person {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String toString() {
//		return this.getName() + ":" + this.getAge() + ":" + subject;
		return super.toString() + ":" + subject;
	}

	public Professor() {
		System.out.println("#Professor 생성자");

	}
}


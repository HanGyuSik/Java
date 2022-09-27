package edu.상속;

public class Employee extends Person {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
//		return name + ":" + age + ":" + dept;  private이기 때문에 사용불가
//		return this.getName() + ":" + this.getAge() + ":" + dept; // public get()으로 가져와서 정의, overriding
		return super.toString() + ":" + dept; // super : 겹치는 부모의 메소드를 그대로 가져오는것, 생성자도 가져옴

	}

	public Employee() {
		System.out.println("#Employee 생성자");

	}
}

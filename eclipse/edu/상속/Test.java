package edu.상속;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
//---------------------------------------------------------------------참조변수 생성
		
		e.setName("K");
		e.setAge(50);
		e.setDept("Z");
		
		p.setName("D");
		p.setAge(54);
		p.setSubject("A");
		
		s.setName("O");
		s.setAge(15);
		s.setMajor("II");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());							// 상속받은것 프린트
		

	}

}


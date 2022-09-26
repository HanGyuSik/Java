package com.ruby.java.ch06;
class CStudents {
	private int Stunum;
	private String Name;
	private int Age;
	
	public void getStudent(int n, String  s, int a) {
		Stunum = n;
		Name = s;
		Age = a;		
	}
	
	public void ShowStudent() {
		System.out.println("Stunum = " + Stunum + "\n"+ "Name = " + Name);
		
	}


}
public class Student {

	public static void main(String[] args) {
		CStudents AA = new CStudents();
		AA.getStudent(22, "tade", 18 );
		AA.ShowStudent();
	}

}

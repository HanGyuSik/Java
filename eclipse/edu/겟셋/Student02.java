package edu.겟셋;

//-------------------클래스

class Students {
	private int Stunum;
	private String Name;
	private int Age;
	private float Height;

	public int getStunum() {
		return Stunum;
	}

	public void setStunum(int stunum) {
		Stunum = stunum;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public float getHeight() {
		return Height;
	}

	public void setHeight(float height) {
		Height = height;
	}

}

public class Student02 {

	public static void main(String[] args) {
		Students As = new Students();
		As.setStunum(50);
		As.setName("lll");
		As.setAge(20);
		As.setHeight(176);
		
		System.out.println(As.getName() + ":" + As.getAge());
	}
}

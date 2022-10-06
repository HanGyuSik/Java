package Test.Abstract;

abstract class Person { // 추상클래스 (super)
	private String pnum;
	private String name;
	private int age;

	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}

	abstract void show(); // toString()를 호출하여 sysout으로 처리

	abstract void increase(); // salary, scholarship, or dayPay를 10% 증가

	@Override
	public String toString() {
		return "Person [pnum=" + pnum + ", name=" + name + ", age=" + age + "]";
	}

}

class Employee extends Person { // sub1
	private String job;
	private String dept;
	private int salary;

	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	void show() {
		System.out.println(
				super.toString() + "\n\t" + "Employee [job=" + job + ", dept=" + dept + ", salary=" + salary + "]");
	}

	void increase() {
		salary *= 1.1;
	}
}

//-----------------------------------------------------------

class Designer extends Employee { // sub1-1
	private String language;
	private int workYear;

	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language,
			int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}

	void show() {
		System.out
				.println(super.toString() + "\n\t" + "Designer [language=" + language + ", workYear=" + workYear + "]");
	}
}

//-----------------------------------------------------------

class Student extends Person { // sub2
	private String schoolName;
	private int schoolyear;
	private int scholarship;

	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}

	void show() {
		System.out.println(super.toString() + "\n\t" + "Student [schoolName=" + schoolName + ", schoolyear="
				+ schoolyear + ", scholarship=" + scholarship + "]");
	}

	void increase() {
		scholarship *= 1.1;
	}
}

//--------------------------------------------------------

class WorkStudent extends Student { // sub2-1
	private String Job;
	private int dayPay;

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship,
			String Job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.Job = Job;
		this.dayPay = dayPay;
	}

	void show() {
		System.out.println(super.toString() + "\n\t" + "WorkStudent [Job=" + Job + ", dayPay=" + dayPay + "]");
	}

	void increase() {
		dayPay *= 1.1;
	}
}

//=======================메인 class==========================================================================

public class TestPerson {
	static void showAll(Person[] p) {
		for (Person x : p) {
			x.show(); // 동적바인딩 구현
		}

		System.out.println();
		System.out.println();
	}

	static void increaseAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].increase(); // 동적바인딩 구현
		}
	}

	static void getData(Person[] p) {
		Employee e = new Employee("p01", "Hong", 20, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Kong", 25, "AB", "Design", 2500, "KR", 3);
		Student s = new Student("p03", "Uong", 21, "pusan", 5, 3500);
		WorkStudent w = new WorkStudent("p04", "Long", 25, "pusan", 4, 3750, "professor", 55);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}

	public static void main(String[] args) {

		Person[] setPerson = new Person[4]; // 배열(객체)선언
		getData(setPerson); // getData 호출
		showAll(setPerson); // show() 호출
		increaseAll(setPerson); // increase() 호출
		showAll(setPerson); // show() 호출

	}

}
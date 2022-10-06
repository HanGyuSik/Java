package JavaTest;

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
		return "Person : pnum=" + pnum + ", name=" + name + ", age=" + age;
	}

}

class Employee extends Person implements Message { // sub1
	private String job;
	private String dept;
	private int salary;

	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "\t" + "Employee : job=" + job + ", dept=" + dept + ", salary=" + salary;
	}

	void show() {
		System.out.println(this.toString());
	}

	void increase() {
		salary *= 1.1;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "LOL";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
}

//-----------------------------------------------------------

class Designer extends Employee implements Message { // sub1-1
	private String language;
	private int workYear;

	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language,
			int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}

	public String toString() {
		return super.toString() + "\t" + "Designer : language=" + language + ", workYear=" + workYear;
	}

	void show() {
		System.out.println(this.toString());
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "OP";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
}

//-----------------------------------------------------------

class Student extends Person implements Message { // sub2
	private String schoolName;
	private int schoolyear;
	private int scholarship;

	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}

	public String toString() {
		return super.toString() + "\t" + "Student : schoolName=" + schoolName + ", schoolyear=" + schoolyear
				+ ", scholarship=" + scholarship;
	}

	void show() {
		System.out.println(this.toString());
	}

	void increase() {
		scholarship *= 1.1;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "No";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
}

//--------------------------------------------------------

class WorkStudent extends Student implements Message { // sub2-1
	private String Job;
	private int dayPay;

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship,
			String Job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.Job = Job;
		this.dayPay = dayPay;
	}

	public String toString() {
		return super.toString() + "\t" + "WorkStudent : Job=" + Job + ", dayPay=" + dayPay;
	}

	void show() {
		System.out.println(this.toString());
	}

	void increase() {
		dayPay *= 1.1;
	}

	@Override
	public String getMessage() { // 인터페이스의 메소드를 구현(this사용X, 함수로써 리턴값.
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
}

//=======================메인 class==========================================================================

public class TestPerson_02 {
//	static void showAll(Person[] p) {
//		for (Person x : p) {
//			x.show(); // 동적바인딩 구현
//		}
//
//		System.out.println();
//		System.out.println();
//	}
//
//	static void increaseAll(Person[] p) {
//		for (int i = 0; i < p.length; i++) {
//			p[i].increase(); // 동적바인딩 구현
//		}
//	}

	static void messageShowAll(Message[] m) {
		for (int i = 0; i < m.length; i++) {
			m[i].setMessage(m[i].getMessage()); // 동적바인딩 구현, setMessage필수
			System.out.println(m[i].getMessage()); // 
		}
	}

	static void getData(Message[] m) {		// 받을 배열형식 이름으로 설정
		Employee e = new Employee("p01", "Hong", 20, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Kong", 25, "AB", "Design", 2500, "KR", 3);
		Student s = new Student("p03", "Uong", 21, "pusan", 5, 3500);
		WorkStudent w = new WorkStudent("p04", "Long", 25, "pusan", 4, 3750, "professor", 55);
		m[0] = e;
		m[1] = d;
		m[2] = s;
		m[3] = w;
	}

	public static void main(String[] args) {

		Message[] setData = new Message[4]; // 배열(객체)선언
		getData(setData); // getData 호출
		messageShowAll(setData);
//		showAll(setPerson); // show() 호출
//		increaseAll(setPerson); // increase() 호출
//		showAll(setPerson); // show() 호출
		Message.getConnection();

	}

}
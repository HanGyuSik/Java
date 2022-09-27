package edu.객체지향;

public class PersonTest {

	public String doWork(String[] args) {

		if (args == null || args.length != 2) {
			System.out.println("usage : java PersonTest name year");
			return "Fail";
		}
		
		Person p = new Person();
		
//		p.setName("홍길동");
//		p.setYear(2000);

		p.setName(args[0]);
		p.setYear(Integer.parseInt(args[1]));

		System.out.println("Info:" + p.toString());
		
		return "Success";
	}

	public static void main(String[] args) {
		
		PersonTest pt = new PersonTest();
		
		//String ret = pt.doWork(null);
		String ret = pt.doWork(args);
		
		System.out.println("Result:" + ret);
	}
}

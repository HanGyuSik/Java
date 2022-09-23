package com.ruby.java.ch06;

public class ShowStudent {

	public static void main(String[] args) {
		Students As = new Students();
		As.setStunum(50);
		As.setName(null);
		As.setAge(20);
		As.setHeight(176);
		
		System.out.println(As.getName() + ":" + As.getAge());
	}
	

}

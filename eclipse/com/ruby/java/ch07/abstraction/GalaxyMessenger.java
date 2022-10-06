package com.ruby.java.ch07.abstraction;

public class GalaxyMessenger implements Messenger {

	public String getMessage() {
		return "galaxy";
	}

	public void setMessage(String msg) {
		System.out.println("galaxy에서 입력 :" + msg);
	}

	public void changeKeybord() {
		System.out.println("터치후 키보드 변경");
		

	}
}

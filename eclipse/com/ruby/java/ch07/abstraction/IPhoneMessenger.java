package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger implements Messenger {
	
	
	public String getMessage() {
		return "iPhone";
	}

	public void setMessage(String msg) {
		System.out.println("iphone에서 입력 :" + msg);
	}

	public void clearMessage() {
		System.out.println("흔들어서 삭제");

	}
}

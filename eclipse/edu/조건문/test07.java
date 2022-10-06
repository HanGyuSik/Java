package edu.조건문;

import edu.겟셋.Student01;

public class test07 {

	public static void main(String[] args) {
		
//-------------변수 정의---------------
		
		int a = 12;
		int b = 2;
		char op = '+';
		
		Student01 t = new Student01();
		t.setName("Talde");
		System.out.println(t.getName());
		
//--------if~else if구문-----------------------		
		
		if(op == '+') {
			System.out.println(a + b);
		} else if(op=='-') {
			System.out.println(a - b);
		} else if(op=='*') {
			System.out.println(a * b);
		} else if(op=='/') {
				System.out.println(a / b);
		}
		
		System.out.println();
//-----------switch문------------------------	switch문의 경우 break가 없으면 계속 실행	
				
		switch(op) {
		case '+': 
			System.out.println(a + b);
		case '-': 
			System.out.println(a - b);
		case '*': 
			System.out.println(a * b); break;
		case '/': 
			System.out.println(a / b);
			
		}

	}

}

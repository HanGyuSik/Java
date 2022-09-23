package edu;

public class test04 {

	public static void main(String[] args) {
		
//------연산자 복습----------------------------
		
	int a = 10;
	int b = 2;
		
		a += b;
		System.out.println(a);	// a1 + b = a2 : 12 
		
		a -= b;
		System.out.println(a);	// a2 - b = a3 : 10
		
		a *= b;
		System.out.println(a);	// a3 * b = a4 : 20
		
		a /= b;
		System.out.println(a);	// a4 / b = a5 : 10
		
		a %= b;
		System.out.println(a);	// a5 % b = a6 : 0
		
		
		System.out.println();
//------if문 개념----------------------------------
		
		String id = "QWE";
		String password = "zxc";
		
		if(id == "QWE" && password == "zxc") {		// id와 password가 둘다 일치할 경우
			System.out.printf("환영합니다. \n");
		}
		

	}

}

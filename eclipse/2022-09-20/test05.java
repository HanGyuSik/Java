package edu;

public class test05 {

	public static void main(String[] args) {
		
//------Boolean과 부정문--------------------
		boolean is0n = true;
		is0n = !is0n;
		System.out.println(is0n);
		
		System.out.println();		
//------다양한 데이터의 계산---------------------		
		
		byte a = 23;
		int b = a;
			System.out.println(b);		// int > byte
		
		System.out.println();
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e;
			System.out.println(f);		// int > short > byte
		
		System.out.println();
			
		int g = 23;
		byte h = (byte)g;
			System.out.println(h);		// int를 byte값으로 전환
		
		System.out.println();
		
		byte i = 10;
		byte j = 20;
		byte k = (byte) (i + j);
			System.out.println(k);		// 기본 출력값(int)를 byte로 전환

	}

}

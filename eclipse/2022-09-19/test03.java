package edu;

public class test03 {

	public static void main(String[] args) {
		
//------숫자의 증감-------------		
		
		int a = 10;
			a++;
		System.out.println(a);
			++a;
		System.out.println(a);
		
		int b = 10;
			b--;
		System.out.println(b);
			--b;
		System.out.println(b);
		
		System.out.println();		
//-----숫자 증감식의 차이-----------		
		int c = 10;
		int d = 10;
		
		System.out.println(++c);
		System.out.println(d++);
		
		System.out.println();
//-----비교 연산자----------------		
		int v = 10;
		int w = 20;
		
		System.out.println(v > w);
		System.out.println(v < w);
		System.out.println(v >= w);
		System.out.println(v <= w);
		System.out.println(v == w);
		System.out.println(v != w);

	}

}

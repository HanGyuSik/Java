package edu.기초;

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
		
//------연산자 복습----------------------------
		
	int aa = 10;
	int bb = 2;
		
		aa += bb;
		System.out.println(aa);	// aa1 + bb = aa2 : 12 
		
		aa -= bb;
		System.out.println(aa);	// aa2 - bb = aa3 : 10
		
		aa *= bb;
		System.out.println(aa);	// aa3 * bb = aa4 : 20
		
		aa /= bb;
		System.out.println(aa);	// aa4 / bb = aa5 : 10
		
		aa %= bb;
		System.out.println(aa);	// aa5 % bb = aa6 : 0
		
		
		System.out.println();		

	}

}

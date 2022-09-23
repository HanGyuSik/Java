package edu;

public class test01 {

	public static void main(String[] args) {
		
// 데이터 형식 byte < short < int < long (정수)	
		
		byte age = 23;
		short point = 32000;
		int price = 3500000;
		long totalSales = 2147483648L;

// 데이터 형식 float < double (실수)
		
		float fprice = 10.1010f;
		double dprice = 10.1111d;
		
//-----------------------------------------------------------------------------		
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
		System.out.println();
		
		System.out.printf("point는 %d입니다.\n" ,point);
		System.out.printf("totalSales는 %d입니다.\n", totalSales);
		System.out.printf("fprice는 %f입니다.\n", fprice);
		System.out.printf("dprice는 %f입니다.\n", dprice);

	}

}

package edu.조건문;

public class test06 {

	public static void main(String[] args) {

//--------if~else구문--------------------------		

		int score01 = 90;
		String result = "";		 // 문자열

		if (score01 >= 60) {		// 조건에 해당할 경우 앞을 출력
			result = "합격";
		} else {				// 조건에 해당하지 않을경우 뒤를 출력
			result = "불합격";
		}
		System.out.println(result);
		
		System.out.println();
//------if~else~if구문--------------------
		int score02 = 90;
		char grade;
		
		if(score02 >= 90) {
			grade = 'A';
		}else if(score02 >= 80) {
			grade = 'B';
		}else if(score02 >= 70) {
			grade = 'C';
		}else if(score02 >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
				
	}

}

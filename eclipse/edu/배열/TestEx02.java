package edu.배열;

import java.util.Scanner;		// 스캐너 사용 패키지 호출

public class TestEx02 {
	
//------------행렬 직접 입력--------------------------------------
	
	public static void main(String[] args) {

		int[][] arr = new int[3][3];						// 배열 정의
	
		Scanner sc = new Scanner(System.in);				// 스캐너 사용을 위한 객체 생성, System.in : 직접 입력을 받기위한 명령어

//----------행렬 틀 제작----------------------------------------
		
		for (int i = 0; i < arr.length; i++) {				// arr.length : 배열 길이, 행을 설정
			for (int j = 0; j < arr[1].length; j++) {		// arr[1].length : arr[1]의 길이, 열을 설정
				arr[i][j] = sc.nextInt();					// int 형 입력 및 리턴
			}
		}
		
//----------행렬에 직접 입력한 것 배치---------------------------		

		for (int i = 0; i < arr.length; i++) {				// 행 제작
			for (int j = 0; j < arr[i].length; j++) {		// 열 제작

				System.out.print(arr[i][j]);				// 각 숫자를 i,j 위치에 배열
				System.out.print("\t");						// 탭으로 칸 이동
			}
			System.out.println("\n");						// 줄바꿈
		}
		sc.close();											// 스캐너 사용 종료

	}
	
//----------------------스캐너 명령어 모음------------------------------	
//	nextByte()		byte 형 입력 및 리턴
//	nextShort()		short 형 입력 및 리턴
//	nextInt()		int 형 입력 및 리턴
//	nextLong()		long 형 입력 및 리턴
//	
//	nextFloat()		float 형 입력 및 리턴
//	nextDouble()		double 형 입력 및 리턴
//	 
//	nextBoolean()	boolean 형 입력 및 리턴
//	 
//	next()			String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
//	nextLine()		String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)

}

package 실습풀이;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		double dnum = sc.nextDouble();
		String str = sc.next();
		
		System.out.println(inum+":"+dnum+":"+str);
		
		sc.close();	
	}

}

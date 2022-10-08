package BackJun03;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		
		
		for(int i = 0; i <= a; i++) {
			sum +=i;
			
		}
		System.out.println(sum);

	}

}

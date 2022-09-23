package edu;
import java.util.Scanner;
public class TestEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int [2][3];
		int [][] b = new int [2][3];
		int [][] c = new int [a.length][b[0].length];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		
		for(int k = 0; k < b.length; k++) {
			for(int l = 0; l<b[1].length; l++) {
				b[k][l] = sc.nextInt();
			}
		}
		
		for(int m = 0; m < a.length; m++) {
			for(int n = 0; n < b[0].length; n++) {
				c[m][n] = a[m][n] + b[m][n];
				
				System.out.print(c[m][n]);
				System.out.print("\t");
			
		}	
			System.out.printf("\n");
		}	sc.close();
	} 
}

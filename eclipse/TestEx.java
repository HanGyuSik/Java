package edu;

public class TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RA = 4;
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				for(int k=0; k<RA; k++) {
					System.out.printf("%d*%d=%d\n", (i+k),j,(i+k)*j);
					
				}
			}
		}

	}

}

package edu;
public class TestEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [3][3];
				
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					double d = Math.random();
					int n = (int)(d*10);
					arr[i][j] = n;
				}
			}
		
		
		for(int i = 0; i<arr.length; i++) {			
			for(int j = 0; j<arr[i].length; j++) {	
											
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");	
		}
			
				
		
/*		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j<arr[1].length; j++)
				arr[i][j] = sc.nextInt();
						
		for(int i = 0; i<arr.length; i++)			
			for(int j = 0; j<arr[i].length; j++)	
								
				System.out.print(arr[i][j]);
				System.out.print("\t");

			System.out.println("\n");
		sc.close(); */
	}
}

	



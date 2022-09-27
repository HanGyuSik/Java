package Test.sequence;

public class TestEx03 {

	public static void main(String[] args) {
		
//------------랜덤 숫자로 행렬 제작--------------------------		

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				double d = Math.random();						// Math.random() : 랜덤하게 1 미만의 소수를 배정
				int n = (int) (d * 10);							// 소수로 받은것을 정수로 치환
				arr[i][j] = n;									// 정수로 치환한 숫자를 배열에 대입
			}
		}

//--------------행렬 제작-------------------------------		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}


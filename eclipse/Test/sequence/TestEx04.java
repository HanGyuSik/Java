package Test.sequence;

public class TestEx04 {

//-------------동일한 형태를 가진 배열 제작 툴-------------------------------------------

	private static void inputArr(int[][] t) { // 임의의 함수 선언, () = 파라미터 입력

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {

				double l = Math.random();
				int P = (int) (l * 10);
				t[i][j] = P;

			}
		}
	}

//--------------두 배열을 더하는 함수---------------------------------------------
	private static void matrixSum(int[][] x, int[][] y) {
		int[][] c = new int[x.length][y[0].length];
		for (int m = 0; m < x.length; m++) {
			for (int n = 0; n < y[0].length; n++) {

				c[m][n] = x[m][n] + y[m][n];

				System.out.print(c[m][n]);
				System.out.print("\t");

			}
			System.out.printf("\n");
		}
	}

//-------------------출력장소 main----------------------------------------------

	public static void main(String[] args) {

		int[][] a = new int[2][3]; // 배열 선언
		int[][] b = new int[2][3]; // 배열 선언

		inputArr(a); // inputArr() 호출
		inputArr(b); // inputArr() 호출
		matrixSum(a, b); // matrixSum() 호출

	}

}

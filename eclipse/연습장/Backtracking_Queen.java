package 연습장;

public class Backtracking_Queen {
	public static void SolveQueen(int[][] d) {
		int count = 0;
		int ix = 0, iy = 0;
		Stack2 st = new Stack2(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		st.push(p);

		while (count < 8) {
			// p = st.pop();
			// int cx = p.getX(); int cy = p.getY();
			// count--;
//			while (cx < d.length)
//			{
//				while (cy < d[0].length) {
////					if (checkRow(d, cx) && checkCol(d, cy) && checkDiagSW(d, cx,cy) && checkDiagSE(d, cx,cy)) {
////						Point px = new Point(cx,cy);
////						st.push(px); count++;
////						break;
////					}
//					cy++;
//				}
//				cx++;
//				System.out.println("cx = "+ cx);
//				count++;
//			}
			// System.out.println("cx = "+cx + "cy = "+cy);
			count++;

		}
	}

	public static boolean checkRow(int[][] d, int cx) {
		return true;
	}

	public static boolean checkCol(int[][] d, int cy) {
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		return true;
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
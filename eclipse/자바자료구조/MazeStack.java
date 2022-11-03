package 자바자료구조;

import java.util.Stack;

class Maze {
	// 현재 쥐가 있는 배열위치(i,j)
	private int i;
	private int j;

	// 쥐가 이동하는 방향함수의 순서(-move[dir])
	private int dir;

	// 생성자
	public Maze(int i, int j, int dir) {
		this.i = i;
		this.j = j;
		this.dir = dir;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Maze [i=" + i + ", j=" + j + ", dir=" + dir + "]";
	}

}

public class MazeStack {
	private int maze[][] = { 
			{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 }, 
			{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 }, 
			{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, 
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 } };
	
	//출구에 해당하는 좌표
	private int m = maze.length - 1;
	private int n = maze[0].length - 1;
	
	// 방향 지정
	public int move[][] = { 
			{ -1, 1 }, // N
			{ -1, 1 }, // NE
			{ 0, 1 }, // E
			{ 1, 1 }, // SE
			{ 1, 0 }, // S
			{ 1, -1 }, // SW
			{ 0, -1 }, // W
			{ -1, -1 }// NW
			
			
	};
	
	// 올바른 길 표기
	int mark[][] = new int[maze.length][maze[0].length];

	public MazeStack(int m, int n) {
		// 비교용 스택
		Stack st1 = new Stack();

		// 해답지 스택
		Stack st2 = new Stack();

		// 초기비교값 대입 + 생성자 호출
		st1.push(new Maze(1, 1, 2));

		while (!st1.isEmpty()) {
			Maze mz = (Maze) st1.pop();

			while (mz.getDir() < 8) {
				// 나아갈 방향 지정
				int g = mz.getI() + move[mz.getDir()][0];
				int h = mz.getJ() + move[mz.getDir()][1];

				// 온 방향 = 출구지점
				if (g == m && h == n) {
					System.out.println("출구 발견");

					st1.push(new Maze(mz.getI(), mz.getJ(), mz.getDir()));

					// 도착지점 입력
					st1.push(new Maze(g, h, 0));

					while (st1.isEmpty() != true) {
						st2.push((Maze) st1.pop());

					}
					while (st2.isEmpty() != true) {
						// 올바른길 기록
						mz = ((Maze) st2.pop());
						System.out.println(mz);
					}

				}
				
				if(maze[g][h] == 0 && mark[g][h]==0) {
					mark[g][h] = 1;
					st1.push(new Maze(mz.getI(), mz.getJ(), mz.getDir()));
					
					
					
				}
			}

		}

	}
	public void MazeDisplay() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
	


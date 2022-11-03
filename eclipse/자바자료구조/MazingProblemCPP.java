package 자바자료구조;

import java.util.Scanner;
import java.util.Stack;

class items {
	int x; // 위치 (x축)
	int y; // 위치 (y축)
	int dir; // 이동할 방향의 배열(move배열)

	public items(int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "items [x=" + x + ", y=" + y + ", dir=" + dir + "]";
	}

}

class offsets { // i, j의 좌표값??
	int a;	// i
	int b;  // j

	public offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

//=========================================================================

public class MazingProblemCPP {
	static int input[][] = {	// [12][15] && [1][1] start
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
			{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
	};
	// 전역변수 배열
	static int maze[][] = new int[100][100];		// 탐사할 미로
	static int mark[][] = new int[100][100];		// maze미로에서 지나간 길 표시용 미로
	
	
	
	static void path(int m, int p)	{		
		
		for (int i = 0; i < 14; i++) {		// 미로의 기존 행사이즈 + 2
			for (int j = 0; j < 17; j++) {	// 미로의 기존 열사이즈 + 2
				
					if ((i==0) || (j==0) || (i == 13) || (j == 16)) {	// 기존 미로의 밖
						maze[i][j] = 1;
					}
					else {
						maze[i][j] = input[i - 1][j - 1];
					}
				mark[i][j] = 0;

			}
		}
		
		for (int i = 0; i <= 13; i++)
		{
			for (int j = 0; j <= 16; j++)
				System.out.println(maze[i][j] + " ");
		}
		
		
//		int end;
//		cin >> end;
		
		
		offsets moves[] = new offsets[8];		// offsets 형식의 배열 선언
		
		for (int i  = 0; i < 8; i++) {
			moves[i] = new offsets(0,0);		// 배열구성 : offsets 객체
		}
		
		
		// 각 배열당 offsets값 설정
		// N
		moves[0].a = -1;
		moves[0].b = 0;
		// NE
		moves[1].a = -1;
		moves[1].b = 1;
		// E
		moves[2].a = 0;
		moves[2].b = 1;
		// SE
		moves[3].a = 1;
		moves[3].b = 1;
		// S
		moves[4].a = 1;
		moves[4].b = 0;
		// SW
		moves[5].a = 1;
		moves[5].b = -1;
		// W
		moves[6].a = 0;
		moves[6].b = -1;
		// NW
		moves[7].a = -1;
		moves[7].b = -1;
		// Output a path (if any) in the maze; rows is m, cols is p;

		// 시작점 반복을 막기 위해 1로 표시
		mark[1][1] = 1;
		
		
		// stack import
		Stack<items> stack = new Stack<>();
		items temp = new items(0,0,0);
		temp.x = 1;
		temp.y = 1;
		temp.dir = 2; // 초기이므로 동쪽부터 시작
		stack.push(temp);
			
			// stack이 비어있지 않을 경우
			while (!stack.isEmpty()) {		
				// stack을 꺼내서 판별
				temp = stack.pop();
				
				// 비교하기위해 값 대입
				int i = temp.x;
				int j = temp.y;
				int d = temp.dir;
				
					while (d < 8) {		// moves forward
						// 각 값을 증가(방향이동)
						int g = i + moves[d].a;
						int h = j + moves[d].b;
						
						// 탈출로(같을 경우)
						if ((g == m) && (h == p)) {
							// output path
							System.out.println(stack);				
							System.out.printf("the term near the exit: %d, %d\n", i, j);
							System.out.printf("exit: %d, %d\n", m, p);
							return;
						}
					
						// maze의 다음 장소값이 0, mark의 다음장소 값이 0일경우 이동 가능
						if ((maze[g][h]==0) && (mark[g][h]==0)) { // new position
							// 반복을 피하기위해 1로 지정
							mark[g][h] = 1;
							//push the old temp to the stack, but the direction changes.
							//Because the neighbor in the direction of d has been checked.
							
							// 다음 장소로 이동한 값을 새로 대입
							items tmp = new items(0,0,0);
							tmp.x = i;
							tmp.y = j;
							tmp.dir = d + 1;
							// 새로운 값으로 stack input
							stack.push(tmp); // stack it
							i = g;
							j = h;
							d = 0; // moves to (g,h)
							}
						
						else d++; // try next direction
						}
				}
			System.out.println("no path");
		}

	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
//		int end = sc.nextInt();

		path(12, 15);
	
	}
}
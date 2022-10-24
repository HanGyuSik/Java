package 자바자료구조;

import java.util.Scanner;

public class TestGenericStatck {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		StackBackground s = new StackBackground(64);
		// 외부에 new 포인트 선언하였는 경우 -> 하나의 객체에 데이터를 새로 로딩하여
		// 같은 값만 출력하여 나옴. (Stack : 객체의 주소를 알려주는 타입)
		// 다양한 값을 출력하기 위해서는 여러 객체를 만들어야 함.
		Point p;

		while (true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			// Integer z = null;
			double d = Math.random();
			int x = (int) (d * 10);
			double l = Math.random();
			int y = (int) (l * 10);
			
			
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				// 여기에 new 선언시 새로운 데이터를 새로운 p에 대입.
				p = new Point(x, y);
//				p.setX(x);
//				p.setY(y);

				if (s.isFull())
					System.out.println("스택이 가득찼있습니다.");
				else {
					// 난수 생성 > x,y에 치환

					s.push(p);
				}

				break;

			case 2:
				Point px;
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					px = s.pop();
					System.out.println("팝한 데이터는 " + px + "입니다.");
				}
				break;

			case 3: Point py;
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					py = s.peek();
					System.out.println("피크한 데이터는 " + py + "입니다.");
				}
				break;

			case 4:
				s.dump();
				break;
			}
		}
	}

}

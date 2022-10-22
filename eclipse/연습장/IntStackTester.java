package 연습장;

import java.util.Scanner;

class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // 64칸짜리 스택

		while (true) {
			System.out.println();
			System.out.printf("data count : %d : %d\n", s.size(), s.getCapacity());
			System.out.print("(1)push (2)pop (3)peek (4)dump (0)end : ");

			int menu = sc.nextInt();
			if (menu == 0)	break;

			int x;
			
			switch (menu) {
			case 1:
				System.out.print("data: ");
				x = sc.nextInt();

				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("full stack");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("your pop : " + x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("no stack");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("your peek : " + x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("no stack");
				}
				break;

			case 4:
				s.dump();
				break;

			}

		}
	}

}

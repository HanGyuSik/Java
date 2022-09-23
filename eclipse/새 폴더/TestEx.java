package edu;

public class TestEx {

	public static void main(String[] args) {

		int dan = 3;
		for (int i = 2; i < 10; i += dan) {
			for (int j = 1; j < 10; j++) {
				for (int k = 0; k < dan; k++) {

					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);

					if (k < dan - 1)
						System.out.print("\t");
					else
						System.out.print("\n");
				}
			}
			System.out.print("\n");
		}
	}
}

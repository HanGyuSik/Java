package 자바자료구조;

class Point {
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "<" + x + ":" + y + ">";

	}
}

//제네릭은 예외처리 상속이 불가능하므로 변경
//public class Stack<T> {
public class StackBackground {
	// 스택용 배열
	private Point[] stk;
	// 스택의 용량
	private int capacity;
	// 스택 포인터(데이터 들어있는 마지막 자리)
	private int ptr;

	// 사용자용 예외처리 함수(비어있을 경우)
	public class EmptyIntStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		// 사용자용 예외처리 함수_생성자
		public EmptyIntStackException() {
		}
	}

	// 사용자용 예외처리 함수(용량 초과의 경우)
	public class OverflowIntStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		// 사용자용 예외처리 함수_생성자
		public OverflowIntStackException() {
		}
	}

	// StackBackground 생성자
	public StackBackground(int maxlen) {
		// 초기 포인터 위치
		ptr = 0;
		// 초기 용량크기 설정
		capacity = maxlen;

		// 예외발생 처리
		try {
			stk = new Point[capacity];
		}
		// 메모리 에러발생시 처리
		catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public Point push(Point p) throws OverflowIntStackException {
		// 용량 초과시 에러 방지
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = p;
	}

	public Point pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	public Point peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	public void clear() {
		ptr = 0;
	}

	public int indexOf(Point x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i].equals(x))
				return i;
		return -1;
	}

	public int getCapacity() {
		return capacity;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= capacity;
	}

	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}

package 연습장;

public class IntStack {
	private int[] stk;
	private int capacity;
	private int ptr;

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException { // 데이터를 삽입
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException { // 최근 들어온 데이터 추출
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	public int peek() throws EmptyIntStackException { // 최근 들어온 데이터 확인
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	public void clear() { // 스택 포인터를 0으로 함으로써 스택의 요소 all delete
		ptr = 0;
	}

	public int indexOf(int x) { // 원하는 요소위치 찾기
		for (int i = ptr - 1; i >= 0; i--) { // 꼭대기부터 바닥까지 스캔
			if (stk[i] == x)
				return i;
		}
		return -1; // 없을경우 리턴
	}

	public int getCapacity() {
		return capacity; // 스택 용량 반환
	}

	public int size() {
		return ptr; // 스택에 쌓인 데이터 개수반환
	}

	public boolean isFull() {
		return ptr >= capacity; // 스택이 비었는지 여부
	}

	// 바닥부터 꼭대기까지 출력
	public void dump() {
		if (ptr <= 0) {
			System.out.println("no stack");
		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.println(stk[i]);
			}
		}
	}

}

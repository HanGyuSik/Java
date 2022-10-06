package 연습장;

public class test {

	public static void main(String[] args) {
		try { // 오류가 터지기 전까지 진행
			System.out.println(1);
			System.out.println(10 / 0);
			System.out.println(2);
			System.out.println(3);
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("오류"); // 오류가 발생될 경우 실행 후 바로 탈출
		} finally {
			System.out.println("done"); // 마지막에 무조건 실행되는 마지막 라인
		}

	}

}

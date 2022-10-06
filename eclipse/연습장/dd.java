package 연습장;

public class dd {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 2);
			System.out.println("끝");
		} catch (Exception e) { // catch(예외) -Exception은 모든 예외
			System.out.println("예외 처리"); // 출력
		}
		finally {
			System.out.println("ddd");
		}
	}
	// 최종 출력 : 예외 처리
}

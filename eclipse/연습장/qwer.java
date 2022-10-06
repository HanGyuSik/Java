package 연습장;

public class qwer {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("ok");
		} catch (ArrayIndexOutOfBoundsException e) {
//			String s = e.getMessage();
//			System.out.println("out" + s);		
			System.out.println(e.getMessage());	
		}
	}
}

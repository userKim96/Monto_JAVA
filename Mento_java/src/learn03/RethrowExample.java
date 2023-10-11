package learn03;

public class RethrowExample {
	public static void main(String[] args) {
		try {
			System.out.println("외부 try..");
			
			try {
				System.out.println("내부 try..");
				Exception e = new Exception();
				throw e;
			}
			catch(Exception e) {
				System.out.println("(내부 try-catch) exception : " + e);
				throw e;
			}
			finally {
				System.out.println("finally 구문 출력");
			}
		}
		catch(Exception e) {
			System.out.println("(외부 try-catch) exception : " + e);
		}
		System.out.println("종료");
	}
}

package learn3;

public class Exception1 {
	public static void main(String[] args) {
		try {
			
			Exception e = new Exception("고의 예외");
			throw e;

		}
		catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
	}
}

/* 
 * Exception 생성자 호출시 전달했던 문자열이 내부적으로 저장되어
 * 객체.getMessage()를 호출하면 출력된다.
 */

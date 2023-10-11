package learn04;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.concat(" World"));
		//concat : 문자열 연결
		
		System.out.println(str.substring(2, 4));
		//substring : 시작 위치 ~ 끝 위치전까지 가져온다.

		System.out.println(str.length());
		//length : 문자열의 길이

		System.out.println(str.toUpperCase());
		//toUpperCase : 대문자로 출력
		
		System.out.println(str.toLowerCase());
		//toLowerCase : 소문자로 출력
		
		System.out.println(str.charAt(1));
		//charAt :특정 Index에 위치한 값 출력
		
		System.out.println(str.indexOf("o"));
		//indexOf : 특정 값의 인덱스 위치를 출력
				//	찾지 못할 경우 -1
		
		System.out.println(str.equals("Hello"));
		//equals : 특정 값이 있으면 turn 없으면 false
		
		System.out.println(" test ".trim());
		//trim : 앞 뒤 공백 제거
/*
 * 
 * 		.................. 
 * 
 * 		
 */
		
		
	}
}

package learn6;

import java.util.Calendar;

public class Date3 {
	public static void main(String[] args) {
		
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH);
		int date = a.get(Calendar.MONTH);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println("오늘은 이번주에서 몇 번째인가");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이번 년도에서 오늘이 몇 일째인가");
		System.out.println(a.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이번 달은 며칠까지 있는가");
		System.out.println(a.getActualMaximum(Calendar.DATE));
		
		
	}
}

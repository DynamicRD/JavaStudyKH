package kr.co.khedu.calendar;

import java.util.Calendar;

public class CalendarMain {
	public static final String[] DAY_WEEK = {"일","월","화","수","목","금","토"};
	
	
	public static void main(String[] args) throws InterruptedException {
		Calendar d = Calendar.getInstance();
		System.out.println(d.toString());
		
		System.out.println(d.get(Calendar.YEAR)+"년");
		System.out.println(d.get(Calendar.MONTH)+1+"월");
		System.out.println(d.get(Calendar.DATE)+"일");
		System.out.println(DAY_WEEK[d.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		
		System.out.println(d.get(Calendar.HOUR_OF_DAY)+"시간");
		System.out.println(d.get(Calendar.MINUTE)+"분");
		System.out.println(d.get(Calendar.SECOND)+"초");
		System.out.println(d.get(Calendar.MILLISECOND)/1000.0+" 1/1000초");
		//시간을 세팅하는방법
		d.set(Calendar.YEAR, 2023);
	
	}

}

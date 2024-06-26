package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Date 현재 날짜를 받아서 년-월-일 출력하기
		//Date 최초 1회만 호출
		Date now = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String 년월일 = sdf1.format(now);

		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String 시분초 = sdf2.format(now);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 년월일시분초 = sdf3.format(now);
		
		System.out.println("1.  :  "+년월일);
		System.out.println("2.  :  "+시분초);
		System.out.println("3.  :  "+년월일시분초);
		
		
		//문자열을(SimpleDateFormat - String) 을 날짜(Date)로 변경
		String 날짜문자열 = "2024-05-03";
		try {
			Date parseDate1 = sdf1.parse(날짜문자열);
			// Fri May 03 00:00:00 KST 2024 날짜문자열 뒤에 시분초는 없기 때문에 0으로 표기
			System.out.println(parseDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

package com.kh.test.main;

public class ParseStringPre2 {
	public static void main(String[] args) {
		//String으로 받은 핸드폰번호를 정수로 변경
		String phone = "01012345678";
		int num1 = Integer.parseInt(phone);
		
		//2. String으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		
		//3. 정수로 받은 핸드폰번호를 String으로 변환
		int phone2 = 102345678;
		String str1 = Integer.toString(phone2);
		
		//4. 실수로 받은 점수를 String으로 변경
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		
		System.out.println("String -> 정수 : " + num1);
		System.out.println("String -> 실수 : " + num2);
		System.out.println("정수 -> String : " + str1);
		System.out.println("실수 -> String : " + str2);
		
		//문자열에서	-	하이픈 제거
		String phoneNumber3 = "010-1234-5678";
		//replace 어떤 값을 모두 바꾸기
		//""안에 아무것도 작성해주지 않으면 삭제라는 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-", "");
		System.out.println("하이픈이 제거된 핸드폰 번호 : " + 하이픈제거);
		
		
		//주민번호에서  -  제거
		String id = "250304-1234567";
		String 하이픈제거2 = id.replace("-", " ");
		System.out.println("하이픈이 제거된 주민번호 : "+ 하이픈제거2);
		
		//charAt(7)
		//주민등록 번호에서 하이픈을 제거하고 성별을 추출하기
		String id2 = "230101-3456789";
		String 주민번호2 = id2.replace("-","");
		char 성별번호 = 주민번호2.charAt(6);
		System.out.println("성별 번호는 : " + 성별번호);
		
		//3항연산자를 사용해서 성별번호가 1또는 3이면 "남성" : "여성
		String 성별 = (성별번호 =='3' ||성별번호 == '1') ? "남성" : "여성";
		System.out.println(성별);
		
		//주민번호에서 - 제거하고 삼항연산자를 사용해서 성별 추출하기
		String id3 = "200101-4567891";
		String 주민번호3 = id3.replace("-","");
		char 성별번호3 = 주민번호3.charAt(6);
		String 성별3 = (성별번호3 == '3' || 성별번호3 == '1') ? "남성" : "여성";
		System.out.println("주민번호 : " + id3);
		System.out.println("성별 : " + 성별3);
		
		String 주민번호4 = "870101-2345678";
		//주민번호가 앞에는 6자리가 맞는지 확인하고 뒤에는 7자리가 맞는지 확인
		boolean is주민 = 
				(주민번호4.length() == 14) &&// 1. 주민등록번호가 - 포함해서 14자리가 맞는지
				(주민번호4.charAt(6) == '-') &&//2. 주민등록번호 생년월일 작성후 - 들어가있는지
				(주민번호4.substring(0,6).matches("[0-9]+")) &&//3. 앞에 6자리가 숫자로만 이루어져 있는지
				(주민번호4.substring(7).matches("[0-9]+"));//4. 주민번호 뒷자리가 모두 숫자로 이루어져 있는지
		System.out.println("주민번호가 제대로 작성이 이루어졌나요? : " + is주민);
		
	}
}

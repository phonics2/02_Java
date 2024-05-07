package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) 	{
		/*
		 1부터 9까지 값을 스캐너로 각각 입력받아
		 
		 더하기 빼기 곱하기 몫 출력하기
		 
		 int 숫자1
		 int 숫자2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 9까지 숫자를 입력하세요.");
		System.out.print("숫자1 : ");
		int 숫자1 = sc.nextInt();
		sc.nextLine();
		//만약에 숫자1이 1~9까지 값이 아니라면
		if(숫자1<1 || 숫자1>9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요");
			return; //프로그램 종료
		}
		System.out.print("숫자2 : ");
		int 숫자2 = sc.nextInt();
		sc.nextLine();
		if(숫자2 < 1 || 숫자2 > 9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요");
			return; //프로그램 종료
		}

		int sum = 숫자1+숫자2;
		int sub = 숫자1-숫자2;
		int mul = 숫자1*숫자2;
		double div = 숫자1/숫자2;
		if(숫자1<숫자2) {
			System.out.println("더한값 : " + sum);
			System.out.println("뺀  값 : " + sub);
			System.out.println("곱한 값 : " + mul);
			System.out.println("나눌수 없습니다.");
		}else{


			System.out.println("더한값 : " + sum);
			System.out.println("뺀  값 : " + sub);
			System.out.println("곱한 값 : " + mul);
			System.out.println("나눈 값 : " + div);
			
	}
}
}

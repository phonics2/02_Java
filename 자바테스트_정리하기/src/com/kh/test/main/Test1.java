package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//만약에 숫자가 1 ~ 100
		if((num > 1) && (num <=100)) {
			if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
		}else {
		System.out.println("1부터 1사이 값만 입력하세요.");
		}
		
		System.out.println("=== if     else if    else ===");

		int 숫자1 = 5;
		
		if(숫자1 > 0) {
			System.out.println("양수입니다.");
		} else if(숫자1 < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}

}
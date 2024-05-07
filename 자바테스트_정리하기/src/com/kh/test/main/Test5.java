package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int 정수1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int 정수2 = sc.nextInt();
		sc.nextLine();
		int result = 정수1 *정수2;
		
		if(정수1 >= 1 && 정수1 <= 9 && 정수2 >= 1 && 정수2 <= 9) {
			if(result >= 1 && result <= 9) {
				System.out.println("한자리 수 입니다.");
			} else {
				System.out.println("두자리 수 입니다.");
			}
		}else {
			System.out.println("입력 한 수중에서 1~9가 아닌 수가 있습니다.");
		}
		
	}
}

package com.kh.test.main;

public class Test2 {
	
	public static void main(String[] args) {
		
		for(int 단 = 2; 단 <= 5; 단++) {
			단 += 1;
			System.out.println();
			for(int a = 1; a <= 9; a += 2) {
				System.out.println(단+" * "+a+" = "+단*a);
			}
			
		}
	}
}

package com.kh.test.main;

public class Test7 {
	
	public static void main(String[] args) {
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		
		double 합 = 0;
		//for each 문을 사용해서 모두 돌고
		for(int a : 배열) {
			//if 문을 사용해서 % 2 != 아니면 += 해주기
			if(a % 2 != 0) {
				System.out.println(a);
				합 +=a;

			}
		}
		System.out.println(합);
	}
}

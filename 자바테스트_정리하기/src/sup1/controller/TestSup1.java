package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	
	

	public static void main(String[] args) {
		//스캐너 이용해서
		Scanner sc = new Scanner(System.in);
		
		//국어점수 영어점수 수학점수 입력받고
		System.out.print("국어점수 : ");
		int 국어 = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 : ");
		int 영어 = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int 수학 = sc.nextInt();
		sc.nextLine();
		
		Score 점수 = new Score(국어,영어,수학);
		
		점수.결과();
		
		
		

	}
	
		
}


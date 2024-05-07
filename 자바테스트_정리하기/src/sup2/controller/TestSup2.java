package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		sc.nextLine();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("성적 : ");
		double result = sc.nextDouble();
		sc.nextLine();
		
		
		Student st = new Student(name,grade,classroom,number,gender,result);
		st.정보();
	}
}

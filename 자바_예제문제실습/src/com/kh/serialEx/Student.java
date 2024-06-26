package com.kh.serialEx;

import java.io.Serializable;

//학생을 직렬화하기

public class Student implements Serializable{
//필드	
	private String name;
	private int age;
	
	
//메서드
	//생성자 : 기본
	public Student() {
		
	}
	
	//생성자 : 필수
	public Student(String name, int age) {
	this.name = name;
	this.age = age;
}

	//Setter
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return"이름 : "+name+"\n나이 : "+age+"세";	
				
	}
}

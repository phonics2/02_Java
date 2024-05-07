package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PizzaShop {
	
	public static void main(String[] args) {
		//주문 목록을 저장할 ArrayList   주문리스트
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희","박철진","안영식","고영희","박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페페로니","마르게리따","슈프림","슈프림","치즈"));
		
		
		//for문 활용해서 주문 추가
		for(int i = 0; i < 고객리스트.size(); i++) {
			PizzaOrder 오더 = new PizzaOrder(고객리스트.get(i),피자리스트.get(i));
			주문리스트.add(오더);
		}
		
		
		//HashSet 사용해서 중복 주문을 방지하기 위한 set 	중복주문방지
		Set<String> 중복주문방지 = new HashSet<>();
		
		
		//주문추가 PizzaOrder 를 사용해서 주문을 추가
		
		
		//주문한 내용 전체 보기 toString
		//toString 추가로 어떤 출력을 진행한다 하지 않아도 PizzaOrder 작성한 자체가
		//정보를 정확하게 출력한다는 의미로 표기됨
		System.out.println(주문리스트);
		
		//1개씩 보고 싶다면 for-each
		for(PizzaOrder 주문 : 주문리스트) {
			System.out.println(주문);
		}
		//중복된 주문 정보 제거한거 출력 for - each
		for(String a : 중복주문방지) {
			System.out.println(a);
		}
	}
}

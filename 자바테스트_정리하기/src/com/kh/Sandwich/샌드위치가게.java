package com.kh.Sandwich;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 샌드위치가게 {
	
	public static void main(String[] args) {
		//주문리스트 ArrayList
		//"김하나" , "BLT"
		//"이둘" , "터키"
		//"김하나" , "치킨"
		//"이셋" , "에그마요"
		//"김하나" , "베지터블"
		ArrayList<샌드위치> 주문리스트 = new ArrayList<>();
		주문리스트.add(new 샌드위치("김하나","BLT"));
		주문리스트.add(new 샌드위치("이둘","터키"));
		주문리스트.add(new 샌드위치("김하나","치킨"));
		주문리스트.add(new 샌드위치("이셋","에그마요"));
		주문리스트.add(new 샌드위치("김하나","베지터블"));
		
		System.out.println(주문리스트);
		//고객명 HashSet // 중복된 값을 넣어놓는 쓰레기통
		Set<String> 고객명 = new HashSet<>();
		
		//중복제거리스트 ArrayList
		List<샌드위치> 중복제거리스트 = new ArrayList<>();
		
	
		for(샌드위치 주문 : 주문리스트) {
			
			//중복여부를 확인하고 중복되지 않은 주문만 리스트에 추가
			if(!고객명.contains(주문.get고객명())) {
				중복제거리스트.add(주문);
				고객명.add(주문.get고객명());
				
			}
		}
		//중복제거리스트 출력
		
		System.out.println(중복제거리스트);
		//for-each
		for(샌드위치 주문 : 중복제거리스트) {
			System.out.println(주문);
		}
	}
}

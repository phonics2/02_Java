package 자바_예제문제실습;

public class 배열 {
	
	public static void main(String[] args) {
		
		Circle[] 원들 = new Circle[2];
		System.out.println("원들[0] : " +원들[0]);
		System.out.println("원들[1] : " +원들[1]);
		원들[0] = new Circle(2.5);
		원들[1] = new Circle(3.5);
		System.out.println("넣은후");
		
		//for 문 범위 확인
		for(int i = 0; i < 원들.length; i++) {
			System.out.println(원들[i].getRadius());
		}
		
		
	}
}

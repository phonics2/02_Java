package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		bArray[0] = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		bArray[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		bArray[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		
		//for-each문 사용해서 출력
		for(Book a : bArray) {
			System.out.println("Title : "+ a.getTitle());
			System.out.println("Author : "+ a.getAuthor());
			System.out.println("Price : "+ a.getPrice());
			System.out.println("Publisher : "+ a.getPublisher());
			System.out.println("discountRate : "+ a.getDiscountRate());
			System.out.println("할인된가격 : " + a.get할인가()+"원");
		}
	}
}

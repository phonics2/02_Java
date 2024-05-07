package ncs.test10;

public class BookStore {
	public static void main(String[] args) {
		/*
		 Book 책정보;
		 	  책정보 = new Book("IT","HTML5", 30000.0 , 15.0);
		 	  
		 
		 책정보 = new Book("IT","HTML5", 30000.0 , 15.0);	 
		 
		 자료형 변수명 = 리터럴(값);	// 메모리 사용이 감소
		 
		 자료형 변수명;
		 변수명 = 리터럴(값)	// 메모리 사용이 위에서 작성한 것보다 조금 더사용
		 */
		Book 책정보;

		
		책정보 = new Book("IT","HTML5", 30000.0 , 15.0);
		System.out.println("기본정보");
		System.out.println(책정보.getBookName() + " " + 책정보.getBookPrice());
		
		BookUpdate 정보수정 = new BookUpdate(책정보);
		
		정보수정.updataBookPrice();
		System.out.println("변경된 가격정보");
		System.out.println(책정보.getBookName() + " " + 책정보.getBookPrice());
	}
}

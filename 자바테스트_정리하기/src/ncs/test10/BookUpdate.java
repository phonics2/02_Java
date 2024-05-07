package ncs.test10;

public class BookUpdate {
//필드
	//Book 객체 불러오기
	private Book bookData;
	
	


	//Setter
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	//Getter
	public Book getBookData() {
		return bookData;
	}
	
	//생성자 : 기본
	public BookUpdate() {
		
	}
	
	//생성자 : 필수
	public BookUpdate(Book bookData) {
		this.bookData = bookData;
	}
	
	public void updataBookPrice() {
		double 할인가 = bookData.getBookPrice() * (1 - bookData.getBookDiscountRate()/ 100);
		bookData.setBookPrice(할인가);
	}
	
}

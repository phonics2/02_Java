package ncs.test10;

public class Book {
//필드
	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
//메서드
	
	//Setter
	public void setCategory(String category) {
		this.category = category;
	}
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	//Getter
	public String getBookName() {
		return bookName;
	}

	public String getCategory() {
		return category;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	
	
	//생성자 : 기본
	public Book() {
		
	}

	
	//생성자 : 필수
	public Book(String category, String bookName, double bookPrice, double bookDiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}


}

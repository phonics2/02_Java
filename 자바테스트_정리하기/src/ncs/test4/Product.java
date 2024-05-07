package ncs.test4;

public class Product {
//필드
	private String name;
	private int price;
	private int quantity;
//메서드	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public Product() {
	
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String information() {
		return"상품명 : " +name+"\n상품가격 : "
	+price+"\n상품수량 : "+quantity;
	}
	
}

package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
//필드 전역변수	
	private String productName;// 제품명
	private Date putDate; // 입고일
	private Date getDate; // 출고일
	private int putAmount; // 입고량
	private int getAmount; // 출고량
	private int inventoryAmount;// 남은갯수

//메서드
	// 생성자 : 기본
	public Inventory() {

	}

	// 생성자 : 필수
	//  핸드폰 이름 출시일 재고량			판매와 판매후 남은 재고는 알 수 없기 때문에 지워줘야함
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	// Getter Setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	
	
	
	
	//toString @Override alt shift s s
	@Override
	public String toString() {
		
		//날짜 형식을 변경
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String 입고일변환 = dateFormat.format(putDate);
		
		String 출고일변환 = dateFormat.format(getDate);
		
		int 남은재고 = putAmount- getAmount;
		
		return "제품명 : " + productName
				+ ", 입고일 : " + 입고일변환 
				+ ", 출고일 : " + 출고일변환
				+ ", 상품재고 : " + putAmount +"개"
				+ ", 판매량 : " + getAmount +"개"
				+ ", 팔고 남은 량 : " + 남은재고+"개";
				
			
	}
	
	
}

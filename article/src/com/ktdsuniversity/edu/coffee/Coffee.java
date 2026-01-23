package com.ktdsuniversity.edu.coffee;

/**
 * <pre>
 * 데이터 클래스
 * 커피메뉴를 나타낸다
 * </pre>
 */
public class Coffee {
	
	/**
	 * 커피 메뉴의 이름
	 */
	private String name;
	
	/**
	 * 커피메뉴의 가격
	 */
	private int price;
	
	/**
	 * 하루동안 판매할수있는 커피의 양
	 */
	private int stock;
	/**
	 * 생성자 - 파라미터가 있으므로 기본생성자 생성 x
	 */
	public Coffee(String name, int price, int stock) {
		// 생성자의 this는 생성자에서 말하는 인스턴스
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return this.stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}

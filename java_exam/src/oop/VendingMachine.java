package oop;

public class VendingMachine {
	
	/**
	 * 자판기 메뉴의 이름
	 */
	String name;
	
	/**
	 * 메뉴의 가격
	 */
	int price;
	
	/**
	 * 메뉴의 수량
	 */
	int stockInQuantity;
	
	/**
	 * 생성자 - 파라미터가 있으므로 기본생성자 x
	 * @param name
	 * @param price
	 * @param stockInQuantity
	 */
	public VendingMachine(String name, int price, int stockInQuantity) {
		this.name = name;
		this.price = price;
		this.stockInQuantity = stockInQuantity;
	}
}

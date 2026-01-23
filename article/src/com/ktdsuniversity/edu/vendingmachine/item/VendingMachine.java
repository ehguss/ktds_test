package com.ktdsuniversity.edu.vendingmachine.item;

public class VendingMachine {
	
	/**
	 * 자판기 메뉴의 이름
	 */
	private String name;
	
	/**
	 * 메뉴의 가격
	 */
	private int price;
	
	/**
	 * 메뉴의 수량
	 */
	private int stockInQuantity;
	
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
	public int getStockInQuantity() {
		return this.stockInQuantity;
	}
	public void setStockInQuantity(int stockInQuantity) {
		this.stockInQuantity = stockInQuantity;
	}
}

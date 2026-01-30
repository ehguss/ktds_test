package com.ktdsuniversity.edu.homework.shop.item;

public class Stuff {

	private String stuffName;
	
	private int price;
	
	private int stockInQuantity;
	
	public Stuff(String stuffName, int price, int stockInQuantity) {
		this.stuffName = stuffName;
		this.price = price;
		this.stockInQuantity = stockInQuantity;
	}

	public String getStuffName() {
		return stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockInQuantity() {
		return stockInQuantity;
	}

	public void setStockInQuantity(int stockInQuantity) {
		this.stockInQuantity = stockInQuantity;
	}
	
	
}

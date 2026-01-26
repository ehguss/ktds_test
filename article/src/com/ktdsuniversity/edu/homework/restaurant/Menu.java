package com.ktdsuniversity.edu.homework.restaurant;

public class Menu {
	
	
	/**
	 * 식당의 이름
	 */
	private String menuName;
	
	/**
	 * 메뉴의 가격
	 */
	private final int PRICE = 2_000;
	/**
	 * 메뉴의 배부름 정도
	 */
	private int cuisineFullLevel;

	/**
	 * 주류의 취함 정도
	 */
	private int drinkDrunkLevel;
	
	public Menu(String menuName, int cuisineFullLevel, int drinkDrunkLevel) {
		this.menuName = menuName;
		this.cuisineFullLevel = cuisineFullLevel;
		this.drinkDrunkLevel = drinkDrunkLevel;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPRICE() {
		return PRICE;
	}
	
	public int getCuisineFullLevel() {
		return cuisineFullLevel;
	}

	public void setCuisineFullLevel(int cuisineFullLevel) {
		this.cuisineFullLevel = cuisineFullLevel;
	}

	public int getDrinkDrunkLevel() {
		return drinkDrunkLevel;
	}

	public void setDrinkDrunkLevel(int drinkDrunkLevel) {
		this.drinkDrunkLevel = drinkDrunkLevel;
	}
	
	
}

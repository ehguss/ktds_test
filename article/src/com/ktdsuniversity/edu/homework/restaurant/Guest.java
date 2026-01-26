package com.ktdsuniversity.edu.homework.restaurant;

public class Guest {
	/**
	 * 고객명
	 */
	String name;
	/**
	 * 배부른 정도
	 */
	private int fullnessLevel;
	
	/**
	 * 취함 정도
	 */
	private double drunkLevel;

	/**
	 * 고객의 소지금
	 */
	private int asset;

	public Guest(String name, int fullnessLevel, double drunkLevel, int asset) {
		this.name = name;
		this.asset = asset;
		this.fullnessLevel = fullnessLevel;
		this.drunkLevel = drunkLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFullnessLevel() {
		return this.fullnessLevel;
	}

	public void setFullnessLevel(int fullnessLevel) {
		this.fullnessLevel = fullnessLevel;
	}

	public double getDrunkLevel() {
		return this.drunkLevel;
	}

	public void setDrunkLevel(double drunkLevel) {
		this.drunkLevel = drunkLevel;
	}
	
	public int getAsset() {
		return asset;
	}

	public void setAsset(int asset) {
		this.asset = asset;
	}
	
	
//	public boolean isCanEatCuisine(int cuisineFullLevel, int restaurantFullLevel) {
//		return this.fullnessLevel + cuisineFullLevel <= restaurantFullLevel;
//	}
//	
//	public boolean isCanDrink(double drinkDrunkLevel, double restaurantDrunkLevel) {
//		return this.drunkLevel + (drinkDrunkLevel*0.1) <= restaurantDrunkLevel;
//	}
}

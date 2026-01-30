package com.ktdsuniversity.edu.abstracts;

public class Guest {
	
	/**
	 * 소비자가 가진 돈
	 */
	private int money;
	
	/**
	 * 소비자가 가진 포인트
	 */
	private int point;


	public Guest(int money, int point) {
		this.money = money;
		this.point = point;
	}
	
	
	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	public void pay(int amount) {
		this.money -= amount;
	}
	
	public void giveMoney(int remainMoney) {
		this.money += remainMoney;
	}
	

	public void usePoint(int point) {
		this.point -= point;
	}


	public void addPoint(int point) {
		this.point += point;
	}
	
	@Override
	public String toString() {
		return "고객에게 남은 돈 : " + this.money + ", 고객에게 남은 포인트 : " + this.point;
	}


}

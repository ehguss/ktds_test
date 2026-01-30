package com.ktdsuniversity.edu.homework.shop.consumer;

public class Consumer {
	
	/**
	 * 판매자 이름
	 */
	private String name;
	
	/**
	 * 판매자 자본금
	 */
	private int account;
	
	/**
	 * 판매자 포인트
	 */
	private int point;
	
	/**
	 * 판매자 가용 포인트;
	 */
	private int usefulPoint;

	//생성자
	public Consumer(String name, int account, int point) {
		this.name = name;
		this.account = account;
		this.point = point;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	public int getUsefulPoint() {
		return usefulPoint;
	}

	public void setUsefulPoint(int usefulPoint) {
		this.usefulPoint = usefulPoint;
	}
}

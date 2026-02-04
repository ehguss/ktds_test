package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {

	private String name;
	private LocalDate expireDate;
	
	//생성자
	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}
	//Getter/ setter

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	
	
	//toString
}

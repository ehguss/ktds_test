package com.ktdsuniversity.edu.app.v1;

public class Phone {

	public static enum Type {
		PERSONAL, HOME, COMPANY
	}
	
	private Phone.Type phoneType;
	private String phoneNumber;
	
	public Phone(Phone.Type phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone.Type getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		String korPhoneType = "";
		if(phoneType == Type.PERSONAL) {
			korPhoneType = "개인";
		}
		else if(phoneType == Type.HOME) {
			korPhoneType = "집";
		}
		else if(phoneType == Type.COMPANY) {
			korPhoneType = "회사";
		}
		return korPhoneType + " : " + phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}

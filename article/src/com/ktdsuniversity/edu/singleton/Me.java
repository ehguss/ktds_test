package com.ktdsuniversity.edu.singleton;

public class Me {
	
	// 전역 ==> static
	private static Me me;
	
	private String name;
	
	// 생성자
	private Me() {
		this.name = "김도현";
	}
	
	public static Me getInstance() {
		
		if (Me.me == null) {
			Me.me = new Me();
		}
		
		return Me.me;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

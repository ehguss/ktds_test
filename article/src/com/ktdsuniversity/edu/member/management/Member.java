package com.ktdsuniversity.edu.member.management;

//데이터클래스
public class Member {

	// 접근제어자 private으로 설정해주었으므로 외부에서 해당 변수에 접근 불가
	private String id;
	private String name;
	
	//생성자
	public Member(String id, String name) {
//		this.setId(id);
//		this.setName(name);
		this.id = id;
		this.name = name;
	}
	
	//getter/setter 위치 : 생성자 밑 or 멤버변수 밑
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//1. public -> private으로 접근범위를 줄여주어 메소드를 만든다. 
	// 다른 클래스에서 해당 메소드(public)에 접근할수있도록 하는 방법
	public void printInfo() {
		System.out.println("작성자 ID : " + this.getId());
		System.out.println("작성자 명 : " + this.getName());
	}
	
	//2. getter(노출)/setter(가져오기)
	
	

}

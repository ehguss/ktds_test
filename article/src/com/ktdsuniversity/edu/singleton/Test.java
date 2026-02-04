package com.ktdsuniversity.edu.singleton;

public class Test {

	public static void main(String[] args) {
		
		Me me = Me.getInstance();
		System.out.println(me);
		
		Me you = Me.getInstance();
		System.out.println(you);
		
		System.out.println(me == you);
		
		System.out.println(me.getName());
		System.out.println(you.getName());
		
		you.setName("아무개");
		
		System.out.println(me.getName());
		System.out.println(you.getName());
	}
}

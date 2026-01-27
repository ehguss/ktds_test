package com.ktdsuniversity.edu.string;

public class StringConcat {
	
	public static void main(String[] args) {
		
		String abcd = "sdfsdfsdfqwererglkjlkdjf";
		
		int i = 0;
		while(i<100){
			abcd += abcd;
			i++;
		}
		
		System.out.println("완료되었습니다.");
	}
}

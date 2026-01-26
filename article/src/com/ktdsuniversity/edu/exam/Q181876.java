package com.ktdsuniversity.edu.exam;

public class Q181876 {

	private String myString;
	
	public Q181876() {
		this.myString = "aBcDeFg";
	}
	public void print() {
		String result = "";
		for(int i = 0; i < this.myString.length(); i++) {
			String alpha = this.myString.charAt(i)+"";
			result += alpha.toLowerCase();
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		Q181876 question = new Q181876();
		question.print();
	}
}

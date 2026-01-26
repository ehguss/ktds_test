package com.ktdsuniversity.edu.exam;

public class Q181878 {

	private String myString;
	private String pat;
	
	public Q181878() {
		this.myString = "aaAA";
		this.pat = "aaaaa";
	}
	public void print() {
		String lowerMyString = this.myString.toLowerCase();
		String lowerPat = this.pat.toLowerCase();
		
		if(lowerMyString.contains(lowerPat)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	public static void main(String[] args) {
		Q181878 question = new Q181878();
		question.print();
	}
}

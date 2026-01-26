package com.ktdsuniversity.edu.exam;

public class Q181843 {

	private String my_string;
	private String target;
	
	public Q181843() {
		this.my_string = "banana";
		this.target = "ana";
	}
	
	public void print() {
		if(this.my_string.contains(target)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
	public static void main(String[] args) {
		Q181843 question = new Q181843();
		question.print();
	}
}

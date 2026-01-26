package com.ktdsuniversity.edu.exam;


public class Q181847 {

	private String n_str;
	
	public Q181847() {
		this.n_str = "0010";
	}
	public void print() {
		int num = Integer.parseInt(this.n_str);
		System.out.println("\"" + num + "\"" );
	}
	public static void main(String[] args) {
		Q181847 question = new Q181847();
		question.print();
	}
}

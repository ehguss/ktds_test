package com.ktdsuniversity.edu.exam;


public class Q181848 {

	private String n_str;
	
	public Q181848() {
		this.n_str = "10";
	}
	public void print() {
		System.out.println(Integer.parseInt(this.n_str));
	}
	
	public static void main(String[] args) {
		Q181848 question = new Q181848();
		question.print();
	}
}

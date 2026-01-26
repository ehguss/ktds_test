package com.ktdsuniversity.edu.exam;

public class Q2908 {

	private String num1;
	private String num2;
	
	public Q2908() {
		this.num1 = "734";
		this.num2 = "893";
	}
	
	public void print() {
		int reversedNum1 = Integer.parseInt(new StringBuffer(this.num1).reverse().toString());
		int reversedNum2 = Integer.parseInt(new StringBuffer(this.num2).reverse().toString());
		
		if(reversedNum1 > reversedNum2) {
			System.out.println(reversedNum1);
		}
		else if(reversedNum1 < reversedNum2) {
			System.out.println(reversedNum2);
		}
		else {
			System.out.println("두 수가 같습니다.");
		}
	}
	public static void main(String[] args) {
		Q2908 question = new Q2908();
		question.print();
	}
}

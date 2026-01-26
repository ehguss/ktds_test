package com.ktdsuniversity.edu.exam;

import java.util.Scanner;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class Q11720 {
	
	private Scanner sc;
	private int amount;
	private String num;
	
	public Q11720() {
		this.sc = new Scanner(System.in);
	}
	
	public void printSum() {
		System.out.print("입력할 숫자의 개수를 입력하세요 (1 <= N <= 100) : ");
		this.amount = Integer.parseInt(this.sc.nextLine());
		System.out.print("방금 입력한 숫자만큼 숫자를 공백없이 쓰세요 : ");
		this.num= this.sc.nextLine();
		
		int sum = 0;
		for(int i = 0; i < this.amount; i++) {
			sum += Integer.parseInt(this.num.charAt(i) + "");
		}
		System.out.println("N개의 합 : " + sum);

	}
	public static void main(String[] args) {
		Q11720 question = new Q11720();
		question.printSum();
		
	}
}

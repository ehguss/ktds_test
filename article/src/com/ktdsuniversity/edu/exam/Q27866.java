package com.ktdsuniversity.edu.exam;

import java.util.Scanner;

//단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
public class Q27866 {

	private Scanner keyboard;
	private String wordS;
	private int numI;
	
	public Q27866() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void printI() {
		
		System.out.print("단어를 입력해주세요 : ");
		
		this.wordS = this.keyboard.nextLine();
		System.out.print("숫자를 입력해주세요 : ");
		
		this.numI= this.keyboard.nextInt();
		
//		String numIstWord = this.wordS.substring(this.numI - 1, this.numI);
		String numIstWord = this.wordS.charAt(this.numI - 1) + "";
		
		System.out.println(numIstWord);
		
	}
	
	public static void main(String[] args) {
		Q27866 question = new Q27866();
		question.printI();
	}
}

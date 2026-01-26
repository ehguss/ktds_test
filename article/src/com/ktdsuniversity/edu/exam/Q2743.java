package com.ktdsuniversity.edu.exam;

import java.util.Scanner;

//알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
public class Q2743 {

	private Scanner sc;
	private String wordOnlyEng;
	
	public Q2743(){
		this.sc = new Scanner(System.in);
	}
	
	public void printLength() {
		System.out.print("알파벳으로만 이루어진 단어를 입력하세요 : ");
		this.wordOnlyEng = this.sc.nextLine();
		
		int wordLength = this.wordOnlyEng.length();
		
		System.out.println("단어의 길이 : " + wordLength);
	}
	public static void main(String[] args) {
		Q2743 question = new Q2743();
		question.printLength();
	}
}

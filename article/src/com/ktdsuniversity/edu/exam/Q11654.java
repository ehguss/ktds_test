package com.ktdsuniversity.edu.exam;

import java.util.Scanner;

//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class Q11654 {

	private Scanner sc;
	private String value;
	
	public Q11654() {
		this.sc = new Scanner(System.in);
	}
	
	public void printAscii() {
		System.out.print("알파벳 소문자, 대문자, 숫자 0-9중 하나를 입력하세요 : ");
		this.value = this.sc.nextLine();
		
		int ascii = (int)(this.value.charAt(0));
		System.out.println("아스키 코드값 : " + ascii);
	}
	public static void main(String[] args) {
		Q11654 question = new Q11654();
		question.printAscii();
	}
}

package com.ktdsuniversity.edu.exam;

//영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
//이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
//단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
public class Q1152 {

	private String sentence;
	
	public Q1152() {
		this.sentence = "The Curious Case of Benjamin Button";
	}
	public void print() {
		System.out.println(this.sentence.split(" ").length);
	}
	public static void main(String[] args) {
		Q1152 question = new Q1152();
		question.print();
	}
}

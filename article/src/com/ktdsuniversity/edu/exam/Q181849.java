package com.ktdsuniversity.edu.exam;

//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
public class Q181849 {

	private String num_str;
	
	public Q181849() {
		this.num_str = "1000000";
	}
	
	public void print() {
		int sum = 0;
		for(int i = 0; i < this.num_str.length(); i++) {
			sum += Integer.parseInt(this.num_str.charAt(i)+"");
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Q181849 question = new Q181849();
		question.print();
	}
}

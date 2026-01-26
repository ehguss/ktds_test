package com.ktdsuniversity.edu.exam;

//문자열 배열 strArr가 주어집니다. 
//모든 원소가 알파벳으로만 이루어져 있을 때, 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
//짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
public class Q181875 {

	private String[] strArr;
	
	public Q181875() {
		this.strArr = new String[] {"aBc","AbC"};
	}
	
	public void print() {
		String result = "[";
		for(int i = 0; i<this.strArr.length; i++) {
			if(i % 2 == 1) {
				//인덱스가 홀수면 대문자
				this.strArr[i]= this.strArr[i].toUpperCase();
			}
			else {
				this.strArr[i] = this.strArr[i].toLowerCase();
			}
			
			if(i == this.strArr.length - 1) {
				result += "\""+ this.strArr[i]+"\"]";
			}
			else {
				result += "\""+ this.strArr[i]+"\""+",";
			}
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		Q181875 question = new Q181875();
		question.print();
	}
}

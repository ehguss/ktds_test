package com.ktdsuniversity.edu.exam;

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 
//각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
//포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class Q10809 {

	private String word;
	private String result;
	
	public Q10809() {
		this.word = "baekjoon";
	}
	
	public void print() {
		this.result = "";
		// 알파벳 나열
		for(int i = (int)('a'); i <= (int)('z'); i++) {
			// a부터 포함이 되어있는지 아닌지 유무 확인
			String alpha = (char) i+"";
			if(this.word.contains(alpha)) {
				// a부터 처음등장하는 위치 확인
				int location = this.word.indexOf(i);
				this.result += location + " ";
			}
			else {
				// 없으면 -1
				this.result += "-1 ";
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Q10809 question = new Q10809();
		question.print();
	}
	
	
}

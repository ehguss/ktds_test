package com.ktdsuniversity.edu.array;

import java.util.Arrays;

//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

//여러개의 띄어쓰기를 하나로 묶어준다. -> replace/ contains -> while로 반복하여 최종적으로 하나를 만들기
public class Q181868 {

	public static void main(String[] args) {
		String myString = " i    love  you".trim();
		
		String[] split = myString.split(" ");
		
		for(int i = 0; i<split.length; i++) {
			split[i] = split[i].trim();
		}
		System.out.println(Arrays.toString(split));
		

	}
	
}

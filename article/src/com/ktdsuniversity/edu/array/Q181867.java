package com.ktdsuniversity.edu.array;

import java.util.Arrays;

// 문자열 myString이 주어집니다. 
//myString을 문자 "x"를 기준으로 나눴을 때 
//나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

//강사님 풀이
//endsWith를 사용하고 x가 마지막 문자인 경우 마지막에 스페이스바를 넣어서 푸는 방식으로 구현하심.
public class Q181867 {

	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		String[] split = myString.split("x");
		

		//x가 마지막에 있다면
		String lastword = myString.charAt(myString.length()-1) +"";
		
		if(lastword.equals("x")) {
			int[] result = new int[split.length+1];
//			System.out.println(Arrays.toString(split));
			
			for(int i = 0; i< split.length; i++) {
				result[i] = split[i].length();
//				if( i == split.length -1 && split[i]) {
//					result[]
//				}
			}


			System.out.println(Arrays.toString(result));
		}
		
		else {
			int[] result = new int[split.length];
//			System.out.println(Arrays.toString(split));
			
			for(int i = 0; i< split.length; i++) {
				result[i] = split[i].length();
//				if( i == split.length -1 && split[i]) {
//					result[]
//				}
			}


			System.out.println(Arrays.toString(result));
		}

		
	}
	
}

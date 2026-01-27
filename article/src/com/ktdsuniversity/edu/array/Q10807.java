package com.ktdsuniversity.edu.array;

//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
public class Q10807 {
	
	public static void main(String[] args) {
		
		int[] numArray = {1,4,1,2,4,2,4,2,3,4,4};
		int findNum = 2;
		
		int count = 0;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == findNum) {
				count ++;
			}
		}
		System.out.println(count);
	}
}

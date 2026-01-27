package com.ktdsuniversity.edu.array;

//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class Q10871 {
	
	public static void main(String[] args) {
		int[] numArray = {1 ,10, 4, 9, 2, 3, 8, 5, 7, 6};
		int baseNum = 5;
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] < baseNum) {
				System.out.print(numArray[i] + " ");
			}
		}
		
		
	}
}

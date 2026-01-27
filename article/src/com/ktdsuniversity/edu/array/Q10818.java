package com.ktdsuniversity.edu.array;

//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
public class Q10818 {
	
	public static void main(String[] args) {
		
		int amount = 5;
		int[] arr = {20, 10, 35, 30, 7};
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
					min = arr[j];
					arr[i] = min;
					arr[j] = max;
				}
			}
		}
		
		System.out.println(arr[0] +" " + arr[arr.length-1]);
	}
}

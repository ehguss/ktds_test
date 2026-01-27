package com.ktdsuniversity.edu.array;

//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//예를 들어, 서로 다른 9개의 자연수
//3, 29, 38, 12, 57, 74, 40, 85, 61
//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
public class Q2562 {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int max = 0;
		int i = 0;
		for(i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
				}
			}
		}
		
		for(i = 0; i< arr.length; i++) {
			if( arr[i] == max) {
				System.out.println(i+1);				
			}
		}
	}
}

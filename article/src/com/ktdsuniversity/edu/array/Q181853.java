package com.ktdsuniversity.edu.array;

import java.util.Arrays;

//정수로 이루어진 리스트 num_list가 주어집니다. 
//num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Q181853 {

	public static void main(String[] args) {
		
		int[] arr = {12, 4, 15, 46, 38, 1, 14};
		
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++ ) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int[] result = new int[5];
		for(int i = 0; i< result.length; i++) {
			result[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(result));
	}
}

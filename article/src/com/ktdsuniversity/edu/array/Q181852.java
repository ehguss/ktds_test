package com.ktdsuniversity.edu.array;

import java.util.Arrays;

//정수로 이루어진 리스트 num_list가 주어집니다. 
//num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Q181852 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		
//		int max = 0;
//		int min = 0;
		int temp = 0;
		for(int i = 0; i < num_list.length; i++) {
			for(int j = i+1; j < num_list.length; j++){
				if (num_list[i] > num_list[j]) {
//					max = num_list[i];
//					min = num_list[j];
//					num_list[j] = max;
//					num_list[i] = min;
					
					temp = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = temp;
				}
			}
		}
		
		int[] result = new int[num_list.length - 5];
		for(int i = 5; i< num_list.length; i++) {
			result[i-5] = num_list[i];
		}
		
		System.out.println(Arrays.toString(result));
		
	}
}

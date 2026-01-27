package com.ktdsuniversity.edu.array;

//import java.util.Arrays;

//아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
//양의 정수 배열 arr가 매개변수로 주어질 때, 
//arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 
//X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.

public class Q181861 {
	/*
	public static void main(String[] args) {
		
		int[] arr = {5, 1, 4};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		int[] X = new int[sum];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				for(int j = 0; j < arr[i]; j++) {
					// 처음이면 0부터 쌓고
					X[j] = arr[i];
				}
			}
			else {
				// 시작점 구하기
				int startPoint = 0;
				for(int n = 0; n < i; n++) {
					startPoint += 1;
					System.out.println(startPoint);
				}
				for(int j = arr[i-startPoint]; j < arr[i-startPoint]+arr[i]; j++) {   //i = 1
					// 처음이 아니면 그 전 인덱스의 숫자 - 1 부터 현재 인덱스 숫자까지
					X[j] = arr[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(X));

	}
	*/
	
	public static void make(int[] arr) {
		int sum = 0;	
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int[] result = new int[sum];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j > 0; j--) {
				result[index] = arr[i];
				index++;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		make(new int[] {5, 1, 4});
		make(new int[] {6, 6});
		make(new int[] {1});
	}
}

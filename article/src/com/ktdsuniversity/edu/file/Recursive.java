package com.ktdsuniversity.edu.file;

public class Recursive {
	
	public int sumToZero(int start) {
		
		// start ==> 5
		// > start == 1
		
		if(start == 1) {
			return 1;
		}
		
		return start + sumToZero(start - 1);
	}
	
	public void printNumber(int number) {
		System.out.println(number);
		number--;
		if(number >= 0) {
			printNumber(number);
			System.out.println(number + "스택을 실행을 완료했습니다.");
		}
	}
	
	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		number++;
		if(number <= 2000) {
			print(number);
			System.out.println(number + "스택을 실행을 완료했습니다.");
		}
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(1);
		r.printNumber(2000); 	// 결과 ==> 2000 ~ 0
	}
}

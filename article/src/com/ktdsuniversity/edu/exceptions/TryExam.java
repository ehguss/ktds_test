package com.ktdsuniversity.edu.exceptions;

public class TryExam {

	public static void handleException() {
		
		try {
			Class.forName("com.ktdsuniversity.edu.exceptions");			
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	public static void numberFormatExam(String str) {
		if(str != null) {
			int value = 0;
			
			try {
				System.out.println("변환 전!");
				value = Integer.parseInt(str);   // 예외 발생 가능성 높음
				System.out.println("변환 후!");
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());  		// For input string: "123123123123123"
				nfe.printStackTrace();   	// 에러가 발생하게 된 원인들을 모두 출력 (Call Stack을 모두 출력)
			}
			System.out.println(value);			

		}

	}
	
	public static void main(String[] args) {
		numberFormatExam("10000");
		numberFormatExam("123123123123123");
		numberFormatExam("asdfasdfsdf");
		numberFormatExam("10000");
	}
}

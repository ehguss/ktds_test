package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {

	public static void nullExam(String str) {
		// 모든 인스턴스에서 .을 사용할 때, 무조건 null체크를 해야하는가?
		// . 을 사용하려는 인스턴스가 null이 될 수 있는 가능성이 조금이라도 존재할 때만 null체크 한다.
		//str이 비어있지 않으면(isBlank, isEmpty) 내용을 출력한다.
		if(str!= null &&!str.isEmpty()) {
			System.out.println(str);
		}
		else {
			System.out.println("값이 없습니다.");
		}
		
	}
	
	public static void arrayIndexExam(String[] arr, int index) {
		if( arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}
	
	public static void numberFormatExam(String str) {
		
		if(str == null) {
			System.out.println(0);
			return;
		}

		//숫자를 정수로 변경한다(replace)
		str = str.replace("_", "");
		//11자리, 22억 ==> 0으로 치환
		if(str.matches("^[0-9]+${1,10}")){
			// 숫자만 거르기(^[0-9]+$) + 그 글자가 1~10자리 사이인경우(${1,10})
			//22억
			long tempNum = Long.parseLong(str);
			if(tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			else {
				System.out.println(0);
			}
			
			int num = (int)tempNum;
			System.out.println(str);			
		}
		
	}
	
	public static void main(String[] args) {
//		nullExam("sdfsdf");
//		nullExam("");
//		nullExam("    ");
//		nullExam("sdfsdf");
//		nullExam(null);
//		
//		
//		numberFormatExam("10");
////		numberFormatExam("sdf");
//		numberFormatExam("3_000_000");
//		numberFormatExam("3_000_000_000");
		
		numberFormatExam(null);
		
	}
}

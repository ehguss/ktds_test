package com.ktdsuniversity.edu.fp.basic.convert;

public class Test {

	public static void main(String[] args) {
		
		Converter converter = new Converter();
		
		//숫자로 변환한 결과를 반환.
		converter.printConvertResult("10", str -> Integer.parseInt(str));
		
		// 더 짧게
		converter.printConvertResult("12", Integer::parseInt);
		
		// static이면 파라미터의 타입과 갯수가 일치하면 메소드레퍼런스로 쓸수 있다.
		// 파라미터의 타입을 따라간다.String에 있는 인스턴스메소드를 참조할수 있다...? 
		// 이때는 파라미터의 갯수는 중요하지않고 파라미터의 타입이 중요하다.
		converter.printConvertResult2("asdfsdf", str -> str.length());
		converter.printConvertResult2("asdfsdf", String::length);
		
	}
}

package com.ktdsuniversity.edu.fp.basic.convert;

import java.util.function.Function;

public class Converter {

	// 파라미터를 줄테니 뭐를 반환시켜라 -> Function
	public void printConvertResult2(String str, Function<String, Integer> function) {
		// String을 전달해서 integer를 반환받는다 - function 함수의 의미
		int result = function.apply(str);
		System.out.println(result);
	}
	public void printConvertResult(String str, Changer changer) {
		int result = changer.changeToInt(str);
		System.out.println(result);
	}
}

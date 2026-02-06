package com.ktdsuniversity.edu.fp.basic.stream.advanced.utils;

// abstract - 생성자로 호출할수 없게끔, 인스턴스로 만들수 없게끔?
public abstract class StringUtil {

	private StringUtil() {}
	
	public static int toInt(String str) {
		
		if(str == null) {
			return 0;
		}
		
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}
}

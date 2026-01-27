package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		sb.append("sDFSDfsdf");
		
		String str = sb.toString();    
		System.out.println(sb);
		
		StringBuffer longString = new StringBuffer();
//		for(int i = 0; i < 100; i++) {
//			longString.append("sdfsdfsdfsdfsdfsdfsdfsdfsdf");
//		}
		appendString(longString);
		
		String resultString = longString.toString();
		System.out.println(resultString);
//		System.out.println(">>" + resultString);
	}
	
	public static void appendString(StringBuffer buffer) {
		buffer.append("123123");
	}
}

package exam;

import java.util.Scanner;

public class MethodQuiz11 {
	
	private static char nextChar(char alpha) {
		// TODO Auto-generated method stub
		
		int ascii = (int)alpha + 1;
		char nextChar = (char)ascii;
		return nextChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11. char 타입의 파라미터 하나를 받아 그 다음의 글자를 문자열로 반환한다.
//		- nextChar('a') => "b"
//
//		- nextChar('c') => "d"
//
//		- char 타입은 문자이면서 숫자입니다. 'a'에 1을 더하면 'b'가 됩니다.
//
//		- char 타입의 변수를 String으로 변환하려면 다음과 같은 식을 작성합니다.
//
//		- ((char) 'a' + 1) + "" => 'b'
		
		char alpha = 'C';
		
		char nextChar = nextChar(alpha);
		System.out.println(nextChar);
		
		
//		int ascii = 97;
//		String s = Character.toString((char) ascii); // "a"
//		System.out.println(s);
//		
//		ascii = 65;
//		char ch = (char) ascii;   // 'A'
//		System.out.println(ch);
//		
//		ch = 'A';
//		int code = (int) ch;   // 65
//		System.out.println(code);

	}



}

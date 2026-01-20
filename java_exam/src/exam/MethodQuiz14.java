package exam;

public class MethodQuiz14 {
	
	public static char convertUpperCase(char alpha) {
		// TODO Auto-generated method stub
		int ascii = (int)alpha;
		char upperCase = ' ';
		//97~122
		if(ascii >= 97 && ascii <= 122) {
			int upperAscii = ascii - 32;
			upperCase = (char)upperAscii;
		}
		else {
			upperCase = ' ';
		}
		return upperCase;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		14. 영 소문자 글자 하나를 파라미터로 전달하면 대문자로 변환하여 반환.
//		- convertUpperCase('a') => 'A'
//
//		- convertUpperCase('c') => 'C'
//
//		- 소문자에서 32를 더하면 대문자로 변환됩니다.
//
//		- 전달된 문자가 'a'와 'z' 사이의 문자가 아니라면 '' 를 반환.
//
//		- convertUpperCase('1') => ''
//
//		- convertUpperCase('A') => ''
//
//		- convertUpperCase('^') => ''
		
		char alpha = 'b';
		
		char upperCase = convertUpperCase(alpha);
		
		System.out.println("'" + upperCase + "'" );
	}



}

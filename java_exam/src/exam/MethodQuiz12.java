package exam;

public class MethodQuiz12 {

	private static String getCharacters(char firstAlpha, char secondAlpha) {
		// TODO Auto-generated method stub
		
		String allAlpha = "";
		int asciiFirst = (int)firstAlpha;
		int asciiSecond = (int)secondAlpha;
		
		for(int i = asciiFirst; i <= asciiSecond; i++) {
			allAlpha += (char)i;
		}
		
		return allAlpha;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12. char 타입의 파라미터 두 개를 받아 문자 사이에 있는 모든 글자를 문자열로 반환한다.
//		- getCharacters('a', 'z') => "abcdefghijklmnopqrstuvwxyz"
//
//		- getCharacters('A', 'Z') => "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		
		char firstAlpha = '가';
		char secondAlpha = '나';
		
		String allAlpha = getCharacters(firstAlpha, secondAlpha);
		
		System.out.println("\"" + allAlpha + "\"");
	}



}

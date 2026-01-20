package exam;

public class MethodQuiz13 {

	public static char getLowerCaseAlpha(char alpha, int plus) {
		// TODO Auto-generated method stub
		
		char lowerCaseAlpha = ' ';
		if(plus >= 0 && plus <= 25) {
			int ascii = (int)alpha;
			int asciiResultAlpha = ascii + plus;
			
			lowerCaseAlpha = (char)asciiResultAlpha;
				
		}
		
		else {
			lowerCaseAlpha = ' ';
		}
		return lowerCaseAlpha;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha = 'a';
		int plus = 25;
		
		char resultAlpha = getLowerCaseAlpha(alpha, plus);
		
		System.out.println(resultAlpha);
	}


}

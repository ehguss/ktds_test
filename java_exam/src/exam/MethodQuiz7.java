package exam;

import java.util.Scanner;

public class MethodQuiz7 {

	public static String getEvenOdd(int n, int m) {
		
		String getEvenOddResult = "";
		
		if((n * m) % 2 == 0) {
			getEvenOddResult = "짝수";
		}
		else {
			getEvenOddResult = "홀수";
		}
		
		return getEvenOddResult ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 정수 파라미터 두 개를 전달받아 곱한 결과가 짝수인지 홀수인지 반환한다.
//		- getEvenOdd(4, 5) => "짝수"
//		- getEvenOdd(3, 5) => "홀수"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		int m = sc.nextInt();
		
		String getEvenOddResult = getEvenOdd(n, m);
		
		System.out.println(getEvenOddResult);
		
	}

}

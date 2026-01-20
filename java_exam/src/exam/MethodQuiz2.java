package exam;

import java.util.Scanner;

public class MethodQuiz2 {

	public static String primeNumber(int num) {
		int n = 0;
		int m = 0;
		String primeNumberList = "";
		for(n = 2; n <= num; n++) {
			for(m = 2; m <= num; m++) {
				if(n > m) {
					if(n % m == 0) {		// 약수가 있음 -> n 증가
						break;
					}
					// 없다면 끝까지 탐색해야함.
				}
				else if ( n == m ) {
					if(n >= 4) {
						primeNumberList += n + " ";
					}
				}
				else {
					break;
				}
			}
		}
		
		return primeNumberList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4부터 파라미터로 전달된 숫자 중 소수만 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
		int num = sc.nextInt();
		String primeNumberList = primeNumber(num);
		
		System.out.println(primeNumberList);
	}

}

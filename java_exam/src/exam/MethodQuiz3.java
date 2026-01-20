package exam;

import java.util.Scanner;

public class MethodQuiz3 {

	public static int compareMax(int n, int m) {
		
		int max = 0;
		
		if(n < m) {
			max = m;
		}
		else if(n > m) {
			max = n;
		}
		else {
			max = n;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파라미터로 전달된 숫자 두 개 중 가장 큰 수 하나만 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		int m = sc.nextInt();
		
		int max = compareMax(n, m);
		
		System.out.println("두 수 중 큰 수는 " + max);
	}

}

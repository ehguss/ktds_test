package exam;

import java.util.Scanner;

public class MethodQuiz1 {
	
	public static int plusSum(int num) {
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		//1부터 파라미터로 전달된 숫자까지의 합을 구한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
		int num = sc.nextInt();
		int sum = plusSum(num);
		
		System.out.println(sum);
		
	}
}

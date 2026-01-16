package exam;

import java.util.Scanner;

public class Q120805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 5;
		int result = num1 / num2;
		
		System.out.println(result);
		
		
		int num3 = 7;
		int num4 = 2;
		int result2 = num3 / num4;
		
		System.out.println(result2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1을 입력하세요 :");
		int a = sc.nextInt();
		System.out.print("num2을 입력하세요 :");
		int b = sc.nextInt();
		
		System.out.println(a/b);
		
	}

}

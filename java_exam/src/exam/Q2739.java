package exam;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 사이의 숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		//구구단을 while문을 사용해서
		int i = 1;
		while(i < 10) {
			System.out.println(n + " * "+ i + " = " + n*i++);
		}
	}

}

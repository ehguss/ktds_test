package exam;

import java.util.Scanner;

public class Q25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("4~1000 사이의 4의 배수의 수를 입력하시오 : ");
		int n = sc.nextInt();
		
		n /= 4;
		int i = 0;
		while(i < n) {
			System.out.print("long ");
			i++;
		}
		
		System.out.println("int");
	}

}

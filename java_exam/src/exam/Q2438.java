package exam;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		int i = 0;
		while(i < n) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("*");
			i++;
		}
	}

}

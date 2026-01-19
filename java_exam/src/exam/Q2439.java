package exam;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		int i = 0;
		while(i < n) {
			int j = 1;
			while(j < n-i) {
				System.out.print(" ");
				j++;
			}
			while(j < n) {
				System.out.print("*");
				j++;
			}
			System.out.println("*");
			i++;
		}
	}

}



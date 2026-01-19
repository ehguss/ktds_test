package exam;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10,000 사이의 숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}

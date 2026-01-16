package exam;

import java.util.Scanner;

public class Q10998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		System.out.print("A 를 입력하세요 : ");
		a = sc.nextLine();
		System.out.print("B 를 입력하세요 : ");
		b = sc.nextLine();
		
		int result = Integer.parseInt(a) * Integer.parseInt(b) ;
		System.out.println("A x B = " + result);
	}

}

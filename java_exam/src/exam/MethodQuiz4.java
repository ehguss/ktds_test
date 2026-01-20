package exam;

import java.util.Scanner;

public class MethodQuiz4 {

	public static String isAdult(int age) {
		
		String isAdult = "";
		
		if(age > 19) {
			isAdult = "성인입니다.";
		}
		else {
			isAdult = "미성년입니다.";
		}
		return isAdult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파라미터로 전달된 나이가 성인인지 미성년인지 구분하여 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String isAdult = isAdult(age);
		
		System.out.println(isAdult);
	}

}

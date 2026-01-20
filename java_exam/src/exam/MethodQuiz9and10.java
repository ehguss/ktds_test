package exam;

import java.util.Scanner;

public class MethodQuiz9and10 {
	
	public static double getAverage(int gradeSum, int gradeCnt) {
		// TODO Auto-generated method stub
		
		double average = ((double)gradeSum/(double)gradeCnt) * 100 / 100.0;
		average = Math.round(average * 100)/100.0;
		return average;
	}
	
	public static String getGrade(double average) {
		// TODO Auto-generated method stub
		
		String grade = "";
		
		if(average >= 90) {
			grade = "A";
		}
		else if(average >= 80) {
			grade = "B";
		}
		else if(average >= 70) {
			grade = "C";
		}
		else if(average >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. 합과 점수의 개수를 전달하여 평균을 구해 반환한다. (소수점 둘째 자리까지)
//		- getAverage(150, 3) => 50.00
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수의 합을 적으세요 : ");
		int gradeSum = sc.nextInt();
		System.out.print("점수의 개수를 적으세요 : ");
		int gradeCnt = sc.nextInt();
		
		double average = getAverage(gradeSum, gradeCnt);
		System.out.println(average);
		
		String grade = getGrade(average);
		System.out.println("학점은 " + grade);
	}







}

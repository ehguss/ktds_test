package oop;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kimDoHyeon = new Student();
		
		kimDoHyeon.subject1 = 100;
		kimDoHyeon.subject2 = 90;
		kimDoHyeon.subject3 = 85;
		kimDoHyeon.subject4 = 95;
		
		int sum = kimDoHyeon.getSumAllScores();
		double average = kimDoHyeon.getAverage();
		double courseCredit = kimDoHyeon.getCourseCredit();
		String grade = kimDoHyeon.getABCDE();
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + courseCredit);
		System.out.println("등급 : " + grade);
	}

}

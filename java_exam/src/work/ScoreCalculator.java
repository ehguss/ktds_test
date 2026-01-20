package work;

public class ScoreCalculator {

	public static String computeGrade(int subjA, int subjB, int subjC, int subjD, int subjE) {
		// TODO Auto-generated method stub
		
		int amount = subjA + subjB + subjC + subjD + subjE;
		double average = calcAverage(amount, 5);
		String grade = calcGrade(average);
		return grade;
	}
	
	public static double calcAverage(int amount, int subjectCount) {
		//평균을 구함.
		double average = (amount/subjectCount)* 10 / 10.0;
		return average;
	}
	
	public static String calcGrade(double average) {
		//등급을 구함.
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
		String grade = computeGrade(100, 95, 95, 100, 100);
		System.out.println(grade);
	}



}

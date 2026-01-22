package oop;

public class Student {
	
	int sum;
	
	double average;

	double courseCredit;
	
	int subject1;
	
	int subject2;

	int subject3;
	
	int subject4;
	
	public int getSumAllScores(){
		sum = subject1 + subject2 + subject3 + subject4;
		
		return sum;
	}
	
	public double getAverage() {
		average = Math.round((sum/4.0)*100)/100.0;
		
		return average;
	}
	
	public double getCourseCredit() {
		courseCredit = Math.round((average - 55)/10.0 * 100)/100.0;
		
		return courseCredit;
	}
	
	public String getABCDE() {
		if(courseCredit > 4.0 && courseCredit <= 4.5) {
			return "A+";
		}
		else if(courseCredit > 3.5 && courseCredit <= 4.0) {
			return "A";
		}
		else if(courseCredit > 3.0 && courseCredit <= 3.5) {
			return "B+";
		}
		else if(courseCredit > 2.5 && courseCredit <= 3.0) {
			return "B";
		}
		else if(courseCredit > 2.0 && courseCredit <= 2.5) {
			return "C+";
		}
		else if(courseCredit > 1.5 && courseCredit <= 2.0) {
			return "C";
		}
		else if(courseCredit > 1.0 && courseCredit <= 1.5) {
			return "D+";
		}
		else if(courseCredit > 0.5 && courseCredit <= 1.0) {
			return "D";
		}
		else{
			return "F";
		}
	}
}

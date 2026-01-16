package exam;

public class ArtithmaticQuiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
		int totalScore = subjectA + subjectB + subjectC + subjectD;
//		double average = totalScore / 4.0;
		double average = totalScore / 4d;
		// 4.5 만점 기준 학점 계산. 소수점 이하 두자리까지. (평균점수 - 55) 에서 소수점 계산
		double score = (Math.round((average - 55)*10))/100.0;
		
		System.out.println("점수 총합: " + totalScore);
		System.out.println("점수 평균: " + average);
		System.out.println("학점 결과: " + score);
		
	}

}

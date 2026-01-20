package exam;

public class MethodQuiz8 {

	public static int getSumOfFive(int num[]) {
		
		int getSumOfFiveResult = 0;
		for(int i = 0; i <= 4; i++) {
			getSumOfFiveResult += num[i];
		}
		
		return getSumOfFiveResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. 전달된 정수 파라미터 5개의 합을 구해 반환한다.
//		- getSumOfFive(1, 2, 3, 4, 5) => 15

		int num[] = new int[5];
		
		for(int i = 0; i <= 4; i++) {
			num[i] = (int)(Math.random() * 10) + 1;
			System.out.println(num[i]);
		}
		
		int getSumOfFiveResult = getSumOfFive(num);
		
		System.out.println(getSumOfFiveResult);
	}

}

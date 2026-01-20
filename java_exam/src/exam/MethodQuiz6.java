package exam;

public class MethodQuiz6 {

	public static String getUniqueNumbers() {
		
		int uniqueNumbers[] = new int[7];
		String result = "[";
		for(int i = 0; i <= 6; i++) {
			uniqueNumbers[i] = (int)(Math.random() * 100) + 1;
			if(i != 6) {
				result += uniqueNumbers[i] + ", ";
			}
			else {
				result += uniqueNumbers[i] + "]";
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서로 다른 숫자 7개를 배열에 할당하여 반환한다.
		
// getUniqueNumbers() => [3, 7, 11, 23, 29, 35, 42] (숫자는 예시일 뿐이며, 실행할 때마다 달라짐)
// 단, 배열에 할당된 숫자는 중복되지 않아야 한다.
		
		String result = getUniqueNumbers();
		
		System.out.println(result);
		
	}

}

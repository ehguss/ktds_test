package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중요한 타입 (int, long, float, double, boolean)
		// 나이가 몇살인지 구해보는 나이 계산기
		// 현재 연도 - 나의 생년
		System.out.println(2026 - 2000 + 1);
		
		// Var Naming Convention
		// 1. 첫번째 단어의 첫번째 글자는 소문자로 작성.
		// 2. 두번째 이후의 단어의 첫 번째 글자만 대문자로 작성. (Camel Case)
		// 3. 특수기호나 숫자로 시작할 수 없다.
		//    사용가능한 특수기호 ( _ ) <-- 권장하지 않음
		{
			int nowYear = 2026;
			int myBirthYear = 2000;
			int myAge = nowYear - myBirthYear + 1;
			
			System.out.println("내 나이 : " + myAge);
		}
		
		final long price = 1000;
//		price = 10_000; 상수는 재할당이 안된다. 오류

//		long buildingPrice = 10_000_000_000;  Type MissMatch = 오류
		long buildingPrice = 10_000_000_000L;
		
//		float ratio = 5.111;  Type MissMatch = 오류
		float ratio = 5.111F;
		
		double doubleRatio = 321321.3454213212316546546541921;
		
		//명시적 형변환
		int one = (int) 1L;
		int num = Integer.MAX_VALUE;
		num = num + 1;
		System.out.println(num);  //-2147483648 (정수 오버플로우)
		
		byte bNumber = 127;
//		bNumber = bNumber + (byte) 1;
		bNumber = (byte) (bNumber + 1);
		System.out.println(bNumber);
		
		System.out.println("계산 끝났습니다.");
		
		System.out.println("3 + 7의 결과는 " + 3 + 7);
		System.out.println("3 + 7의 결과는 " + (3 + 7));
		
		
		//다른 형끼리 연산
		System.out.println("long + float : (정수(8byte) + 실수(4byte)) " + 10L + 3.5F + " 실수");
		//casting
		System.out.println(10f/3);
	}

}

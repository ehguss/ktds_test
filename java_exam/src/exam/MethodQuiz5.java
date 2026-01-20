package exam;

public class MethodQuiz5 {

	public static String randomRuleResult(int num) {
		
		String randomRuleResult = "";
		
		if(num % 3 == 0 && num % 5 == 0) {
			randomRuleResult = "FizzBuzz";
		}
		else if(num % 5 == 0) {
			randomRuleResult = "Buzz";
		}
		else if(num % 3 == 0) {
			randomRuleResult = "Fizz";
		}
		else {
			randomRuleResult = ""+ num;
		}
		
		return randomRuleResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 숫자를 생성하고 아래 규칙에 따른 결과를 반환한다.
//		- 3의 배수이면 "Fizz"    
//		- 5의 배수이면 "Buzz"    
//		- 3과 5의 공배수이면 "FizzBuzz"    
//		- 그 외의 숫자이면 숫자 자체를 문자로 변경하여 반환한다.    
//		- getFizzBuzz(9) => "Fizz"    
//		- getFizzBuzz(10) => "Buzz"    
//		- getFizzBuzz(15) => "FizzBuzz"    
//		- getFizzBuzz(7) => "7"
		
		
		int num = (int) (Math.random() * 100) + 1;
//		System.out.println(num);
		
		String randomRuleResult = randomRuleResult(num);
		
		System.out.println(randomRuleResult);
	}

}

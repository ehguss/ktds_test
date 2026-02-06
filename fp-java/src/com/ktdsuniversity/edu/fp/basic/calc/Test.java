package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		// num1, num2를 더해 반환한다.
		int result = calc.calc2(1, 2, (num1, num2) -> {return num1 + num2;});
		// {} 가 있으면 반환을 안한다?
		result = calc.calc2(1, 2, (num1, num2) -> num1 + num2);
		System.out.println(result);

		// num1의 num2를 제곱한 수를 반환
		result = calc.calc2(5, 2, (num1, num2) -> (int)Math.pow(num1 * 1.0 , num2 * 1.0));
		// pow는 int를 파라미터로 받고 return type또한 int이다 따라서 Math.pow는 double을 파라미터로 받고 double을 return해주므로 파라미터, return둘다 int타입으로 해주는 powExact 를 사용
		// 파라미터의 타입이 같고 return타입이 같다면 그 메소드를 그대로 쓸수가 있다.
		result = calc.calc2(5, 2, Math::powExact);
		
		System.out.println("제곱한 수" + result);
		
		// num1, num2 중 큰 수를 반환
		result = calc.calc2(5, 2, (num1, num2) -> (int)Math.max(num1 * 1.0 , num2 * 1.0));
		System.out.println("큰 수" + result);
		// num1, num2 중 작은 수를 반환
		result = calc.calc2(5, 2, (num1, num2) -> (int)Math.min(num1 * 1.0 , num2 * 1.0));
		System.out.println("작은 수" + result);
		// num1이 num2의 배수라면 0을 반환, 아니라면 1을 반환
		result = calc.calc2(5, 2, (num1, num2) -> (num1 % num2 == 0)? 0 : 1);
		System.out.println("배수 " + result);
	}
}

package com.ktdsuniversity.edu.exceptions;

import com.ktdsuniversity.edu.exceptions.custom.DivideZeroException;
import com.ktdsuniversity.edu.exceptions.custom.NullOperatorException;
import com.ktdsuniversity.edu.exceptions.custom.WrongOperatorException;

public class SimpleCalculator {
	
	/**
	 * 계산기
	 * @param a 계산할 값
	 * @param b 계산할 값
	 * @param operator 연산자 (+, -, *, /)
	 * @return 연산자에 따른 결과를 반환
	 */
	public int calc(int a, int b, String operator) {
		int result = 0;
		
		if(operator == null) {
//			System.out.println("연산자가 없으면 계산이 불가합니다.");
			throw new NullOperatorException("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요.");
		}
		if(operator.equals("+")) {
			result = a + b;
		}
		else if(operator.equals("-")) {
			result = a - b;
		}
		else if(operator.equals("*")) {
			result = a * b;
		}
		else if(operator.equals("/")) {
			if(a == 0 || b == 0) {
				throw new DivideZeroException("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요.");
//				System.out.println("0으로 나눌수 없습니다.");
//				return 0;
			}
			result = a / b;
		}
		else {
			throw new WrongOperatorException("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요.");
//			System.out.println("잘못된 연산자 입니다.");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		SimpleCalculator sc = new SimpleCalculator();
		int result = 0;
		try {
			result = sc.calc(10, 0, "+");	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "-");	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "*");	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "/");	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "%");	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);

		try {
			result = sc.calc(10, 0, null);	
		} catch (NullOperatorException noe) {   		// 연산자가 null 일때의 처리
			System.out.println(noe.getMessage());
		} catch (DivideZeroException dze) {		// 숫자가 0일 때의 처리
			System.out.println(dze.getMessage());
		} catch (WrongOperatorException woe) {		// 연산자를 잘못 작성했을 때의 처리
			System.out.println(woe.getMessage());
		}
		System.out.println(result);
	}
}

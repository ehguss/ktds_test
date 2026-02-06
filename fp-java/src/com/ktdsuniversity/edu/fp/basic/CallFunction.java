package com.ktdsuniversity.edu.fp.basic;

import com.ktdsuniversity.edu.fp.basic.impl.CallAge;
import com.ktdsuniversity.edu.fp.basic.impl.CallAge2;
import com.ktdsuniversity.edu.fp.basic.impl.PrintName;
import com.ktdsuniversity.edu.fp.basic.impl.PrintName2;

public class CallFunction {

	public void callInterface(PrintSomething ps) {
		String something = "반갑습니다";
		ps.print(something);
	}
	
	public void callAbstractClass(CallSomething cs) {
		String something = "쉰다섯";
		int result = cs.call(something);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		CallFunction cf = new CallFunction();
		cf.callInterface(new PrintName2());
		cf.callAbstractClass( new CallAge2() );
		
		
		cf.callInterface( new PrintSomething() {

			@Override
			public void print(String message) {
				System.out.println(message);
				if(message != null) {
					System.out.println(message + "는 " + message.length() + "글자입니다.");
				}
			}
		} );
		
		cf.callAbstractClass( new CallSomething() {
			
			@Override
			public int call(String message) {
				if (message != null) {
					return message.length();
				}
				return 0;
			}
		});
		
		// 인스턴스를 전달하는 것이 아닌 메소드만 전달할수는 없나? -> 람다 표현식(함수를 전달한다)
		// 메소드만 전달 -> 람다
		// 반환되는 값 없음(return x)
		// 단 람다는 추상메소드가 한개만 존재해야 사용이 가능 -> 추상메소드가 여러개일 경우 오류(왜냐 이 람다가 누구에게할당될것인지를 모르기때문)
		cf.callInterface((String message) -> { System.out.println(message + "입니다"); });
		// 반환타입이 일치한다면 중괄호와 ; 를 생략해도 된다.
		cf.callInterface(message -> System.out.println(message + "입니다"));
		// 반환되는 값 있음(return o)
//		cf.callAbstractClass((String message) -> { return 0 });
		
		PrintSomething function = (String message) -> {
			if(message == null) {
				System.out.println("파라미터 잘못됨");
			}
			else {
				System.out.println(message.repeat(40));
			}
		};
		
		System.out.println(function);
		//com.ktdsuniversity.edu.fp.basic.CallFunction$$Lambda/0x0000000090040cd8@6d06d69c
		cf.callInterface(function);
		
	}
}

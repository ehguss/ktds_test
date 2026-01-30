package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers{

	private String[] numbers;
	
	public RandomExtractNumbers() {
		this.numbers = new String[100];
	
		int index = 0;
		
		for(int i = 0; i < 10; i++) {
			// 0~99 중 하나가 나옴
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (int)(Math.random() * 1_000_000) + "";
		}
		
		for(int i = 0; i < 10; i++) {
			// 0~99 중 하나가 나옴
			index = (int) (Math.random() * this.numbers.length);
			// 122 - z, 97 - a
			this.numbers[index] = (char)((int)(Math.random() * 26) + 97) + "";
		}
	}
	// 브라우저 -> 서버로 데이터를 전송 -> 데이터베이스에 저장
	// 브라우저에서 서버로 전송된 데이터의 형태가 어떠한지 그 누구도 모른다.
	// - 데이터 검증이 반드시 필요 --> Validation Logic => 예외처리. (데이터를 알맞게 입력했냐?)
	public void printNumber2(int index) {
		if(index >= 0 && index < this.numbers.length) {
			String value = this.numbers[index];
			if(value != null && value.matches("^[0-9]+$")) {
				int intValue = Integer.parseInt(value);
				System.out.println(intValue);
				return;
			}
		}
		System.out.println("0");
	}
	public void printNumber(int index) {
		
		// this.numbers 의 index에 존재하는 값을 출력한다.
		// 값이 숫자인 경우 그대로 출력하고 
		// 숫자가 아닌 경우 0을 출력한다.
		
		if(index < 0 || index >= this.numbers.length){
			System.out.println("Index : " + index + " - Out of range - Result : 0" );
			return;
		}
		
		else {// null 일 경우
			if(this.numbers[index]== null) {
				System.out.println("Index : " + index + " - Value : " + this.numbers[index]);
				System.out.println("Index : " + index + "- Not number format - Result : 0" );
				return;
			}

			//문자일 경우
			else if(!this.numbers[index].toString().matches("^[0-9]+${1,10}")) {
				System.out.println("Index : " + index + " - Value : " + this.numbers[index]);
				System.out.println("Index : " + index + "- Not number format - Result : 0" );
				return;
			}
			
		}
		System.out.println("Index : " + index + "- " + "Value : " + this.numbers[index]);

		// 혹은 모든 예외들은 catch문에서 해결한다고 생각하고 try-catch문을 사용하여 exception으로 퉁치기(안좋음) - 이유 알기 어려움
		// try의 블럭이 길어질수록 속도는 같이 느려진다.

	}
	public static void main(String[] args) {
		
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for(int i = 0; i < 50; i++) {
			index = (int)(Math.random() * 200);
			ren.printNumber(index);
		}
	}
	
}

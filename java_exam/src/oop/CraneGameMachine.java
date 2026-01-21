package oop;

public class CraneGameMachine {
	
	boolean isInsertCoin;
	
	int dolls;
	
	public void insertCoin() {
		isInsertCoin = true;
	}
	
	public int doGame() {
		isInsertCoin = false;
		int popdoll = (int) (Math.random() * 10);
		if(popdoll == 1) {
			dolls -= 1;
			System.out.println("인형뽑기에 성공했습니다.");
			System.out.println("남은 인형 수 : " + dolls);
			return 1;
		}
		else {
			System.out.println("인형뽑기에 실패했습니다.");
			return 0;
		}
	}
}

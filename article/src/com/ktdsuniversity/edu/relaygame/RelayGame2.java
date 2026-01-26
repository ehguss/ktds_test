package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame2 {
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
		this.keyboard = new Scanner(System.in);
	}
	
	//인스턴스 메소드 -> 클래스 메소드에 접근 가능
	public void startGame() {
		System.out.println("게임이 시작되었습니다!");
		System.out.println("시작 단어를 입력해주세요.");
		
		String lastLetter = "";
		String firstLetter = "";
		
		this.startWord = this.keyboard.nextLine();
		
		//몇번 해당사이클이 반복되는지 모름 -while
		while(true) {	//언제끝날지 모르므로 무한히 반복되도록 만듦 - true
			System.out.println("다음 단어를 입력해주세요.");
			this.nextWord = this.keyboard.nextLine();
			//앞뒤 공백 제거된 결과를 할당시키기
			this.nextWord = this.nextWord.trim();
			
			//시작단어의 마지막 글자
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
			
			//다음단어의 첫번째 글자(0~1 까지의글자를 가지고와라) - substring(beginIndex, endingIndex)
//			firstLetter = this.nextWord.substring(0,1);
			
			if(lastLetter.startsWith(firstLetter)) {
				
				//다음단어의 글자가 3글자 이상인가
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				}
				else {
					System.out.println("게임이 종료되었습니다.");
					break;
				}
			}
			else {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		
	}
	
	//클래스 메소드 -> 인스턴스메소드에 접근 못함
	public static void main(String[] args) {
		RelayGame2 game = new RelayGame2();
		game.startGame();
	}
}

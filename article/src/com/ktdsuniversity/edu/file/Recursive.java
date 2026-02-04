package com.ktdsuniversity.edu.file;

import java.io.File;

public class Recursive {
	
	public void deleteDirectory(File target) {
		//폴더 삭제하기
		
		//파일을 삭제하기
		if(target.isFile()) {
			System.out.println(target.getAbsolutePath());
			//해당 파일(target) 삭제
			target.delete();
		}
		//폴더 삭제하기
		else if(target.isDirectory()) {
			// 폴더 내부의 목록의 조회한다. -> 폴더 내부의 폴더
			File[] children = target.listFiles();
			
			for(File child: children) {
				//재귀함수 -> 폴더안의 파일을 삭제하게됨.
				this.deleteDirectory(child);
			}
			
			//여기서 target은 directory
			System.out.println(target.getAbsolutePath());
			target.delete();
		}
	}
	
	public void printFiles(File target) {
		//폴더는 제외하고 파일만 출력
		
		if(target.isFile()) {
			System.out.println(target.getAbsolutePath());
		}
		else if(target.isDirectory()) {
			// 폴더 내부의 목록의 조회한다.
			File[] children = target.listFiles();
			
			for(File child: children) {
				//재귀함수 -> 폴더안의 파일을 읽게됨.
				this.printFiles(child);
			}
		}
	}
	
	public int sumToZero(int start) {
		
		// start ==> 5
		// > start == 1
		
		if(start == 1) {
			return 1;
		}
		
		return start + sumToZero(start - 1);
	}
	
	public void printNumber(int number) {
		System.out.println(number);
		number--;
		if(number >= 0) {
			printNumber(number);
			System.out.println(number + "스택을 실행을 완료했습니다.");
		}
	}
	
	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		number++;
		if(number <= 2000) {
			print(number);
			System.out.println(number + "스택을 실행을 완료했습니다.");
		}
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(1);
//		r.printNumber(2000); 	// 결과 ==> 2000 ~ 0
		
//		File root = new File("C:/DevPrograms");
//		r.printFiles(root);
		
		File root = new File("C:\\Users\\User\\Documents\\삭제대상");
		r.deleteDirectory(root);
	}
}

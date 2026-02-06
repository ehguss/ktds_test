package com.ktdsuniversity.edu.fp.basic;

// 협업 중 다른 사람이 해당 인터페이스에 다른 메소드를 추가하지 못하도록 하는 것
@FunctionalInterface
public interface PrintSomething {

	void print(String message);
	
//	void printRepeat(String message);
}

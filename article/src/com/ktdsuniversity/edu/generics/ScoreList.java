package com.ktdsuniversity.edu.generics;

public class ScoreList<T, SUM_RESULT> {

	// ScoreList에서 사용할 멤버변수
	// 점수들의 배열
	private Object[] scoreArray;
	
	// 배열에 몇개의 데이터가 있는지 확인
	private int size;
	
	//생성자
	public ScoreList(){
		//T[] scoreArray 초기화 : 인덱스가 2개인.
		this.scoreArray = new Object[2];
	}
	
	public void add(T score) {
		if (this.size >= this.scoreArray.length) {
			// 배열의 길이를 늘린다.
			// 1. 기존 배열ㄹ의 길이보다 2개 더 많은 인덱스를 가진 배열을 새롭게 만든다.
			Object[] newArray = new Object[this.scoreArray.length + 2];
			// 2. 기존 배열의 데이터를 새로운 배열에 복사한다.
			/*
			System.arraycopy(원본 배열, 
							 복사를 시작할 원본 배열의 인덱스 번호,
							 복사를 받을 새로운 배열,
							 새로운 배열의 복사를 받을 시작 인덱스 번호,
							 복사할 개수);
			*/
			System.arraycopy(this.scoreArray, 0, newArray, 0, this.scoreArray.length);
			// 3. 새로운 배열을 기존의 배열에 할당한다.
			this.scoreArray = newArray;
		}
		this.scoreArray[this.size++] = score;
	}
	
	public T get(int index) {
		if (this.size <= index) {
			throw new IndexOutOfBoundsException(this.size + "보다 크거나 같은 인덱스는 없습니다.");
		}
		T value = (T) this.scoreArray[index];
		
		return value;
	}
	
	public SUM_RESULT sum( Reducer<T, SUM_RESULT> reducer, SUM_RESULT defaultValue) {
		// 배열에 들어있는 모든 요소들의 합을 구해 반환하려 한다.
		// T에 들어있는게 무엇인지 알수없다. 해당 클래스의 인스턴스를 만들었을때 알수 있음
		SUM_RESULT result = defaultValue;
		
		T t = null;
		for (int i = 0; i < this.size; i++) {
			t = (T) this.scoreArray[i];
			result = reducer.reduce(t, result);
		}
		return result;
	}
}

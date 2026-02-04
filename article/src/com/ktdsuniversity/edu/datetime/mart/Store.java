package com.ktdsuniversity.edu.datetime.mart;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private List<Item> items;
	
	public Store() {
		this.items = new ArrayList<>();
	}
	
	public void add( ) {
		//추가.
	}
	
	public void sell(int index) {
		
		/*
		 * index에 할당되어있는 제품의 소비기한이 당일이라면
		 * "오늘까지 드세요" 를 출력.
		 * 
		 * 소비기한이 3일 내에 도래한다면 
		 * "가능한 빨리 드세요"를 출력.
		 * 
		 * 소비기한이 지났다면
		 * "소비기한이 지나 판매하지 않습니다"를 출력.
		 */
	}
}

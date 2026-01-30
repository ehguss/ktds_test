package com.ktdsuniversity.edu.homework.shop.item;

import com.ktdsuniversity.edu.homework.shop.Consumer;
import com.ktdsuniversity.edu.homework.shop.ConvenienceStore;
import com.ktdsuniversity.edu.homework.shop.DepartmentStore;

public class Mart {
	
	/**
	 * 일반 마트 자본금
	 */
	private int martAccount;
	
	private int receivedPrice;
	
	private int saleprice;
	
	private Stuff[] stuffs;
	
	public Mart(String martName, Stuff stuff1,Stuff stuff2,Stuff stuff3) {
		this.martName = martName;
		this.stuffs = new Stuff[3];
		this.stuffs[0] = stuff1;
		this.stuffs[1] = stuff2;
		this.stuffs[2] = stuff3;
	}
	
	public int getMartAccount() {
		return martAccount;
	}

	public void setMartAccount(int martAccount) {
		this.martAccount = martAccount;
	}

	public int getReceivedPrice() {
		return receivedPrice;
	}



	public void setReceivedPrice(int receivedPrice) {
		this.receivedPrice = receivedPrice;
	}



	public Stuff[] getStuffs() {
		return stuffs;
	}



	public void setStuffs(Stuff[] stuffs) {
		this.stuffs = stuffs;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	
	private String martName;
	
	public Mart(String martName) {
		this.martName = martName;
	}

	String getMartName() {
		return martName;
	}

	void setMartName(String martName) {
		this.martName = martName;
	}
	
	public void order(Consumer consumer, Mart mart, int menu, int quantity, int price) {
		

		this.receivedPrice = price;
		
		// 존재하지 않는 메뉴 주문한 경우
		if(menu < 0 || menu >= this.stuffs.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			return;
		}
		
		// 고객이 소지한 돈보다 상품금액이 더 큰 경우
		if(this.stuffs[menu].getPrice() * quantity > consumer.getAccount()) {
			System.out.println("소지금보다 상품금액이 더 큽니다. 구매가 불가능합니다.");
			return;
		}
		// 주문한 금액보다 낸 돈이 더 적은 경우
		if(this.stuffs[menu].getPrice() * quantity > price) {
//			System.out.println(this.stuffs[menu].getPrice());
			System.out.println(consumer.getName() + "의 구매목록 : " + this.stuffs[menu].getStuffName() + " " + quantity + "개");
			return;
		}
		
		Stuff stuff = this.stuffs[menu];
		
		//주문 한 경우
		//account에 판매 금액 추가하고 거스름돈 주기
		this.setSaleprice(stuff.getPrice() * quantity);
		this.martAccount += this.saleprice;
		this.setMartAccount(this.martAccount);
		this.receivedPrice -= this.saleprice;
		

		// 편의점일 경우
		if( mart instanceof ConvenienceStore cMart) {
			cMart.usePoint(consumer);
			cMart.getPoint(consumer);
		}
		
		//백화점인 경우
		if (mart instanceof DepartmentStore dStore) {
			dStore.getPoint();
		}
		
		consumer.setAccount(consumer.getAccount() - this.getSaleprice());
		
		if(this.receivedPrice > 0) {
			System.out.println(this.receivedPrice + "만큼 거스름돈이 발생했습니다. 받아가세요.");
		}
		System.out.println("구매가 완료되었습니다.");
		
		

		System.out.println(consumer.getName() + "의 소지금 : " + consumer.getAccount());
		System.out.println(consumer.getName() + "의 구매목록 : " + this.stuffs[menu].getStuffName() + " " + quantity + "개 - " + this.getSaleprice() + "원");
		System.out.println();
		
	}
}

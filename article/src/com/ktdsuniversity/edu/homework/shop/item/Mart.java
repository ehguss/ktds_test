package com.ktdsuniversity.edu.homework.shop.item;

import com.ktdsuniversity.edu.homework.shop.ConvenienceStore;
import com.ktdsuniversity.edu.homework.shop.DepartmentStore;
import com.ktdsuniversity.edu.homework.shop.GeneralMart;
import com.ktdsuniversity.edu.homework.shop.consumer.Consumer;

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

	public boolean isCanOrder(Consumer consumer, Mart mart, int menu, int price, int stuffAllPrice, int usefulPoint, int quantity) {
		// 존재하지 않는 메뉴 주문한 경우
		if(menu < 0 || menu >= this.stuffs.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			return false;
		}
		
		// 주문한 금액보다 낸 돈이 더 적은 경우
		// 일반마트일 경우 지불금액이 소지금보다 클 경우 주문 불가
		if (mart instanceof GeneralMart gMart) {
			if(price > consumer.getAccount()) {
				System.out.println("지불금액보다 상품금액이 더 큽니다. 구매가 불가능합니다.");
				return false;
			}
		}
		// 편의점이나 백화점인 경우 지불금액과 가용포인트가 상품금액보다 작을 경우 주문 불가
		else {
			// 고객이 지불한 금액(지불금액 + usefulPoint)보다 상품금액이 더 큰 경우
			if(this.stuffs[menu].getPrice() * quantity > price + consumer.getUsefulPoint()) {
				System.out.println("지불금액보다 상품금액이 더 큽니다. 구매가 불가능합니다.");
				return false;
			}
		}
				
//		if(stuffAllPrice > price + usefulPoint) {
//			System.out.println(consumer.getName() + "가 낸 금액 : " + ( price + usefulPoint )+ "원 - 돈이 부족합니다.");
//			return false;
//		}
		
		return true;
	}
	
	public void order(Consumer consumer, Mart mart, int menu, int quantity, int price) {
		

		Stuff stuff = this.stuffs[menu];
		this.receivedPrice = price;
		int stuffAllPrice = stuff.getPrice() * quantity;
		System.out.println("\n" + consumer.getName() + "의 구매목록 : " + this.stuffs[menu].getStuffName() + " " + quantity + "개, 합계 : " + stuffAllPrice + "원");
		

		int usefulPoint = consumer.getUsefulPoint();
		//포인트 확인 및 할인
		//백화점인 경우
		if (mart instanceof DepartmentStore dStore) {
			usefulPoint = dStore.useDPoint(consumer);
			consumer.setUsefulPoint(usefulPoint);
			stuffAllPrice = dStore.discount(consumer, stuffAllPrice) - usefulPoint;
		}
		
		// 편의점일 경우
		else if( mart instanceof ConvenienceStore cMart) {
			usefulPoint = cMart.useCPoint(consumer);
			consumer.setUsefulPoint(usefulPoint);
			if(stuffAllPrice > usefulPoint) {
				stuffAllPrice -= usefulPoint;				
			}
			else {
				stuffAllPrice = 0;
			}
		}
		
		
		// isCanOrder 호출
		if(isCanOrder(consumer, mart, menu, price, stuffAllPrice, usefulPoint, quantity)) {
		
			//주문 한 경우
			//account에 판매 금액 추가하고 거스름돈 주기
			this.setSaleprice(stuff.getPrice() * quantity);
			this.martAccount += this.saleprice;
			this.setMartAccount(this.martAccount);
			
			System.out.println("== 구매가 완료되었습니다. ==");
			
			//백화점인 경우
			if (mart instanceof DepartmentStore dStore) {
				dStore.getDPoint(consumer);
				consumer.setPoint(consumer.getPoint() - usefulPoint);

				this.receivedPrice = (price + consumer.getUsefulPoint()) - this.saleprice; 
			}
			
			// 편의점일 경우
			else if( mart instanceof ConvenienceStore cMart) {
				if(consumer.getUsefulPoint() >= this.saleprice) {
					consumer.setPoint(0);
					this.receivedPrice = price; 
				}
				else if(100 <= consumer.getUsefulPoint() && consumer.getUsefulPoint() <= this.saleprice) {
					consumer.setPoint(0);
					this.receivedPrice  = price + consumer.getUsefulPoint() - this.saleprice;
				}
				cMart.getCPoint(consumer);
			}
			
//			this.receivedPrice -= this.saleprice - consumer.getUsefulPoint();
			if(this.receivedPrice > 0) {
				System.out.println(this.receivedPrice + "만큼 거스름돈이 발생했습니다. 받아가세요.");
			}
			int account = consumer.getAccount();
			consumer.setAccount(account - price + this.receivedPrice - stuffAllPrice);
		
			System.out.println(consumer.getName() + "의 소지금 : " + consumer.getAccount());
			System.out.println(consumer.getName() + "의 포인트 : " + (int)(consumer.getPoint()));
			System.out.println();
		
		}
	}


}

package com.ktdsuniversity.edu.abstracts;

/**
 * public class Name : 인스턴스로 생성할 수 있는 일반 클래스 정의
 * public abstract class Name : 인스턴스로 생성할 수 없는 추상 클래스 정의
 */
public abstract class AbstractMart {
	
	/**
	 * 금고 - 자본금
	 */
	private int safe;
	/**
	 * 상품 가격
	 */
	private int productPrice;
	
	/**
	 * 고객에게 거슬러줄 돈
	 */
	private int remainMoney;
	
	
	/**
	 * 생성자 정의
	 * @param productPrice 이 값은 객체가 만들어질 때 반드시 필요하고, 나머지는 그때그때 상황에 따라 변하는 값
	 */
	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sell(Guest guest, int sellCount, int money) {
		//손님이 낸 돈
		this.remainMoney = money;
		
		// 사용할 포인트를 머니랑 합쳐서 사용
		int guestPoint = this.usePoint(guest);
		
		/**
		 * 판매금액
		 */
		int amount = sellCount * this.productPrice;
		
		// 할인된 최종 금액
		amount -= this.discount(guest, amount);
		
		//손님이 낸돈이 구매가격보다 작다면 구매 못한다.
		if(money + guestPoint< amount) {
			// 판매 불가능
			System.out.println("돈이 모자랍니다. 구매가격 : " + amount + ", 손님이 낸 돈 : " + money + ", 손님의 가용 포인트 : " + guestPoint);
			return;
		}
		
		//손님이 마트에 돈을 지불.
		guest.pay(money + guestPoint);
		
		this.givePoint(guest, amount);
		
		
		if(amount > guestPoint) {
			this.remainMoney -= amount - guestPoint;
		}
		this.safe += money - this.remainMoney;
		System.out.println("마트 매출액 : " + this.safe);
		System.out.println("거슬러 줄 돈 : " + this.remainMoney);
		
		//마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;

	}
	
	// 얼마를 쓸지 모르고 얼마를 줄지 모름
	public abstract int usePoint(Guest guest);
	
	/**
	 * guest한테 포인트를 지급할테니 알맞게 해서 지급해라 단, 어떻게 포인트를 지급할지 모른다.
	 * @param guest
	 * @param amount
	 */
	public abstract void givePoint(Guest guest, int amount);
	
	public abstract int discount(Guest guest, int amount);
}

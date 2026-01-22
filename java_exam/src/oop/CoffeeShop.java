package oop;

public class CoffeeShop {

	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노 (타입 선언)
	 */
	Coffee hot;
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노 (타입 선언)
	 */
	Coffee ice;
	
	// 파라미터로 클래스의 인스턴스를 옮긴다.
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;		//this - CoffeeShop
		this.ice = ice;		//this - CoffeeShop
	}
	
	/**
	 * 커피숍에서 커피를 판매한다.
	 * @param menu 메뉴들의 번호. 1: hot, 2: ice
	 * @param quantity 주문수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		if(menu == 1) {
			//this를 붙이면서 출처를 명확하게 밝힌다.
			//멤버변수의 hot
			//this.hot.name - 스타벅스(coffeeShop)의 핫의 name이다.
			System.out.println(this.hot.name + " 음료를 " + quantity + "개 주문 받았습니다.");
			return hot.price * quantity;
		}
		else if(menu == 2) {
			//this를 붙이면서 출처를 명확하게 밝힌다.
			//멤버변수의 ice
			System.out.println(this.ice.name + " 음료를 " + quantity + "개 주문 받았습니다.");
			return ice.price * quantity;
		}
		else {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}
	}
}

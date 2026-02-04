package com.ktdsuniversity.edu.homework.restaurant;

import com.ktdsuniversity.edu.homework.restaurant.exception.DrunkenException;
import com.ktdsuniversity.edu.homework.restaurant.exception.FullException;
import com.ktdsuniversity.edu.homework.restaurant.exception.NotEnoughMoneyException;

/**
 * <pre>
 * 회사원들의 회식 장소로 유명한 A 식당이 있습니다.
 * A 식당의 사장은 배가 부른 손님과 과하게 취한 손님에게는 주문을 받지 않기로 유명합니다.
 * 배 부름과 취함의 정도는 식당마다 기준이 다릅니다.
 * A 식당의 사장은 손님의 배부름 정도와 취함 정도로 주문을 받을지 판단합니다.
 * 손님이 음식을 주문하면 음식마다의 무게만큼 배부름 정도가 채워집니다.
 * 손님이 술을 주문하면 술 마다의 알콜 비율의 10% 만큼 취함 정도가 증가합니다.
 * </pre>
 */
public class Restaurant {
	
	/**
	 * 식당의 이름
	 */
	String name;

	/**
	 * 식당에서 정한 배부름 정도
	 */
	int restaurantMaxFullLevel;
	
	/**
	 * 식당에서 정한 취함 정도
	 */
	double restaurantMaxDrunkLevel;
	
	
	/**
	 * 레스토랑에서 판매하는 음식
	 */
	
	Menu cuisine;
	
	/**
	 * 레스토랑에서 판매하는 주류
	 */
	Menu drink;
	
	public Restaurant(String name, Menu cuisine, Menu drink, int restaurantMaxFullLevel, double restaurantMaxDrunkLevel) {
		this.name = name;
		this.cuisine = cuisine;
		this.drink = drink;
		this.restaurantMaxFullLevel = restaurantMaxFullLevel;
		this.restaurantMaxDrunkLevel = restaurantMaxDrunkLevel;
	}
	
	public boolean isFull(Guest guest) {
		if(guest.getFullnessLevel() < this.restaurantMaxFullLevel ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isDrunk(Guest guest) {
		if( guest.getDrunkLevel() < this.restaurantMaxDrunkLevel ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void isGuestCanOrder(Guest guest, int cuisineQuantity, int drinkQuantity) {
		//의사코드
		//식당을 선택한다.(아웃백 : 1, 빕스 : 2, 매드포갈릭 : 3)
		//식당에 입장한다
		// 1. 구매자: 식사 가능한가요?
		// 2. 판매자: 배부름정도와 취함정도를 알려주세요
		//           손님의 배부름정도 > 식당의 기준배부름 && 손님의 취함정도 > 식당의 취함정도 라면 주문가능
		int guestAsset = guest.getAsset();
		int price= (cuisineQuantity + drinkQuantity) * cuisine.getPRICE();
		
		System.out.println("고객명 : " + guest.getName());
		System.out.println(guest.getName() + "의 취함 정도 : " + guest.getDrunkLevel());
		System.out.println(guest.getName() + "의 배부름 정도 : " + guest.getFullnessLevel());
		System.out.println(guest.getName() + "의 소지금 : " + guest.getAsset());
		System.out.println("주문 금액 : " + price);
		System.out.println(this.name + "의 배부름 기준 : " + this.restaurantMaxFullLevel);
		System.out.println(this.name + "의 취함 기준 : " + this.restaurantMaxDrunkLevel);
		
		
		if(isFull(guest) && isDrunk(guest)) {
			// 3. 구매자: 음식 : 1 몇개, 주류 : 2 몇개 주문할께요
			
			if(guest.getAsset() >= price) {
				//           돈이 가능한가?
				//           가능하다면 주문!(손님의 돈에서 메뉴의 가격, 주류의 가격을 뺀다.)
				guestAsset -= price;
				guest.setAsset(guestAsset);
				
				double guestDrunkLevel = guest.getDrunkLevel();
				guestDrunkLevel +=  drink.getDrinkDrunkLevel()* drinkQuantity;
				
				guest.setDrunkLevel(guestDrunkLevel);
				
				int guestFullnessLevel = guest.getFullnessLevel();
				guestFullnessLevel += cuisine.getCuisineFullLevel() * cuisineQuantity;
				guest.setFullnessLevel(guestFullnessLevel);
				
				System.out.println("주문 성공\n");
			}
			// 돈이 없다면
			else {
				System.out.println("주문 금액 : " + price);
				System.out.println("주문 불가 : 잔고 부족\n");
			}
		}
		//           아니면 주문 불가
		// 배부르고 취해서 주문이 불가한 경우
		else if( !isFull(guest) && !isDrunk(guest) ) {
			System.out.println("주문 불가 - 너무 배부르고 너무 취함\n");
		}
		//배불러서 주문 불가
		else if( !isFull(guest) && isDrunk(guest) ) {
			System.out.println("주문 불가 - 너무 배부름\n");
		}
		//너무 취해서 주문 불가
		else if( isFull(guest) && !isDrunk(guest) ) {
			System.out.println("주문 불가 - 너무 취함\n");
		}
	}	
	
	
	public void isGuestCanOrderWithException(Guest guest, int cuisineQuantity, int drinkQuantity) {
		//의사코드
		//식당을 선택한다.(아웃백 : 1, 빕스 : 2, 매드포갈릭 : 3)
		//식당에 입장한다
		// 1. 구매자: 식사 가능한가요?
		// 2. 판매자: 배부름정도와 취함정도를 알려주세요
		//           손님의 배부름정도 > 식당의 기준배부름 && 손님의 취함정도 > 식당의 취함정도 라면 주문가능
		int price= (cuisineQuantity + drinkQuantity) * cuisine.getPRICE();
		
		System.out.println("고객명 : " + guest.getName());
		System.out.println(guest.getName() + "의 취함 정도 : " + guest.getDrunkLevel());
		System.out.println(guest.getName() + "의 배부름 정도 : " + guest.getFullnessLevel());
		System.out.println(guest.getName() + "의 소지금 : " + guest.getAsset());
		System.out.println("주문 금액 : " + price);
		System.out.println(this.name + "의 배부름 기준 : " + this.restaurantMaxFullLevel);
		System.out.println(this.name + "의 취함 기준 : " + this.restaurantMaxDrunkLevel);
		
		// 배부름이 일정 수치를 초과할 경우 FullException - ArrayIndexOutOfBoundsException
		// 취함이 일정 수치를 초과할 경우 DrunkenException - ArrayIndexOutOfBoundsException
		// 음료의 재고를 관리할 경우 품절과 관련된 예외 - NullPointerException
		// 주문 금액과 소비자의 지출금액을 비교하여 예외처리
		// throw된 예외들을 catch 해 예외에 알맞는 메시지가 출력되도록 하기
		
		if(!isFull(guest)) {
			throw new FullException("배부름 수치가 초과되었습니다. 주문이 불가합니다.");
		}
		else if(!isDrunk(guest)) {
			throw new DrunkenException("너무 많이 취했습니다. 주문이 불가합니다.");
		}
		else if(guest.getAsset() < price) {
			throw new NotEnoughMoneyException("돈이 부족합니다. 주문이 불가합니다.");
		}
	}
		
	
}

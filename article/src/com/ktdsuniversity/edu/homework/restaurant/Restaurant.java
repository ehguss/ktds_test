package com.ktdsuniversity.edu.homework.restaurant;

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
	int restaurantFullLevel;
	
	/**
	 * 식당에서 정한 취함 정도
	 */
	double restaurantDrunkLevel;
	
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
	
	
	public Restaurant(String name, int restaurantFullLevel, double restaurantDrunkLevel, int restaurantMaxFullLevel, double restaurantMaxDrunkLevel) {
		this.name = name;
		this.restaurantFullLevel = restaurantFullLevel;
		this.restaurantDrunkLevel = restaurantDrunkLevel;
		this.restaurantMaxFullLevel = restaurantMaxFullLevel;
		this.restaurantMaxDrunkLevel = restaurantMaxDrunkLevel;
	}
	
	public void isGuestCanOrder(Guest guest, int cuisineQuantity, int drinkQuantity) {
		//의사코드
		//식당을 선택한다.(아웃백 : 1, 빕스 : 2, 매드포갈릭 : 3)
		//식당에 입장한다
		// 1. 구매자: 식사 가능한가요?
		// 2. 판매자: 배부름정도와 취함정도를 알려주세요
		//           손님의 배부름정도 > 식당의 기준배부름 && 손님의 취함정도 > 식당의 취함정도 라면 주문가능
		if(guest.getFullnessLevel() < this.restaurantMaxFullLevel && guest.getDrunkLevel() < this.restaurantMaxDrunkLevel) {
			// 3. 구매자: 음식 : 1 몇개, 주류 : 2 몇개 주문할께요
			
			int guestAsset = guest.getAsset();
			int price= guest.getItemCnt() * 2_000;
			
			if(guest.getAsset() >= price) {
				//           돈이 가능한가?
				//           가능하다면 주문!(손님의 돈에서 메뉴의 가격, 주류의 가격을 뺀다.)
				guestAsset -= price;
				guest.setAsset(guestAsset);
				
				double guestDrunkLevel = guest.getDrunkLevel();
				guestDrunkLevel += this.restaurantDrunkLevel * drinkQuantity;
				
				guest.setDrunkLevel(guestDrunkLevel);
				
				int guestFullnessLevel = guest.getFullnessLevel();
				guestFullnessLevel += this.restaurantFullLevel * cuisineQuantity;
				guest.setFullnessLevel(guestFullnessLevel);
				
				System.out.println("고객명 : " + guest.getName());
				System.out.println(guest.getName() + "의 취함 정도 : " + guest.getDrunkLevel());
				System.out.println(guest.getName() + "배부름 정도 : " + guest.getFullnessLevel());
				System.out.println(guest.getName() + "소지금 : " + guest.getAsset());
				System.out.println("주문 금액 : " + price);
				System.out.println(this.name + "의 취함 기준 : " + this.restaurantDrunkLevel);
				System.out.println("주문 성공");
			}
			return;
		}
		
		System.out.println("주문 불가");
		//           없다면 주문 불가
		//           아니면 주문 불가
	}	
	
}

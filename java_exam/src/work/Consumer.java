package work;

public class Consumer {
	/**
	 * 소비자 지갑에 있는 금액
	 */
	int capital;
	
	/**
	 * 구매하고자하는 상품의 개수 (=장바구니에 들어있는 상품의 개수)
	 */
	int buyCnt;
	
	/**
	 * 상품 1개당 가격
	 */
	int stuffPrize;
	/**
	 * 상품1개당 무게
	 */
	int stuffWeight;
	
	/**
	 * 소비자가 들수있는 최대 무게
	 */
	int holdMaxWeight;
	
	/**
	 * 구매 프로세스가 종료되었다면, 구매자의 상품 수, 장바구니의 무게, 지갑의 돈 출력
	 * @return
	 */
	public int buy() {
		
		int allStuffWeight = stuffWeight * buyCnt;
		int allStuffPrize = stuffPrize * buyCnt;
		// 구매목록 무게가 소비자가 들수있는 무게보다 가볍거나 같다면 구매할수있다.
		if(allStuffWeight <= holdMaxWeight) {
			// 무게는 되지만 돈이 안된다.
			if(allStuffPrize > capital) {
				System.out.println("돈이 부족합니다.");
			}
			//무게도 되고 돈도 된다.
			else {
				capital -= allStuffPrize;
				System.out.println("구매자의 상품 수 : " + buyCnt + " 장바구니의 무게 : " + allStuffWeight + " 지갑의 돈 : " + capital);
				return capital;
			}
		}
		//구매목록 무게가 소비자가 들수 없는 무게이다.
		else {
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
		}
		
		return capital;
	}
}

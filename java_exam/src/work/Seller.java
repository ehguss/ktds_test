package work;

public class Seller {
	
	/**
	 * 판매자가 판매하는 모든 상품의 금액
	 */
	int stuffPrize;
	
	/**
	 * 재고 
	 */
	int stock;
	/**
	 * 자본금
	 */
	int capital;
	
	public Seller(int stuffPrize, int stock) {
		this.stuffPrize = stuffPrize;
		this.stock = stock;
	}
	/**
	 * <pre>
	 * 판매 프로세스
	 * 판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려할 경우 남은 재고를 다 판매하고
	 * 남은 재고를 판매한 금액만큼만 판매자의 자본금에 더해야한다.
	 * </pre>
	 * @param sellCnt 판매자가 한번에 판매하는 상품의 개수
	 * @return 자본금 반환
	 */
	public int sell(int sellCnt) {
		
		// 판매하려는 상품의 개수가 재고보다 같거나 적은 경우 -> 판매 개수만큼 자본금에 더하기
		if(stock >= sellCnt) {
			capital += sellCnt * stuffPrize;
			stock -= sellCnt;
		}
		// 판매하려는 상품의 개수(5)가 재고(3)보다 많지만 재고가 남아있는 경우 -> 재고만큼 자본금에 더하기
		else if(sellCnt > stock && stock > 0){
			capital += stock * stuffPrize;
			stock -= stock;
//			stock = 0;   -> 좀 더 직관적이다..
			System.out.println("품절되었습니다.");
		}
		// 재고가 없는 경우
		else {
			System.out.println("품절되었습니다.");
		}
		return capital;
	}
}

package com.ktdsuniversity.edu.market.consumer;

import com.ktdsuniversity.edu.market.seller.Seller;

public class Consumer {

	private int maxCartWeight;
	private int nowCartWeight;

	private int itemCount;
	private int wallet;

	public Consumer(int wallet, int maxCartWeight) {
		this.wallet = wallet;
		this.maxCartWeight = maxCartWeight;
	}

	public int getMaxCartWeight() {
		return this.maxCartWeight;
	}

	public int getNowCartWeight() {
		return this.nowCartWeight;
	}

	public int getItemCount() {
		return this.itemCount;
	}

	public int getWallet() {
		return this.wallet;
	}
	
	public void setMaxCartWeight(int maxCartWeight) {
		this.maxCartWeight = maxCartWeight;
	}

	public void setNowCartWeight(int nowCartWeight) {
		this.nowCartWeight = nowCartWeight;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	public boolean isEnoughMoney(int money) {
		return this.wallet >= money;
	}

	public boolean isEnoughWeight(int weight) {
		int predictWeigth = weight + this.nowCartWeight;
		return this.maxCartWeight >= predictWeigth;
	}

	public void buy(int money, int weight, int productCount) {
		if (!this.isEnoughMoney(money)) {
			System.out.println("돈이 부족합니다.");
		} else if (!this.isEnoughWeight(weight)) {
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
		} else {
			this.wallet -= money;
			this.itemCount += productCount;
			this.nowCartWeight += weight;
		}

		System.out.println("상품의 수: " + this.itemCount);
		System.out.println("장바구니의 무게: " + this.nowCartWeight);
		System.out.println("지갑에 있는 돈: " + this.wallet);

	}

	/**
	 * 구매자가 판매자에게 상품을 구매한다.
	 * @param seller 구매자에게 상품을 판매할 판매자 인스턴스
	 * @param productCount 구매자가 구매할 상품의 개수
	 */
	public void buyFrom(Seller seller, int productCount) {
		// 의사코드
		// 1. 구매자: 혹시 두쫀쿠 productCount 만큼 재고 있나요?
//		int stock = seller.getStock();
		if(seller.isEnoughStock(productCount)){
			// 2. 판매자: 있어요!
			// 3. 구매자: 하나에 얼마에요?
			int price = seller.getPRICE();
			// 4. 판매자: 1000원 입니다.
			// 5. 구매자: (내가 5천원이 있나..?)
			if(this.isEnoughMoney(price * productCount)) {
				//	           있다!
				// 6. 구매자: 혹시, 무게가 많이 무겁나요?
				// 7. 판매자: 한 500g 합니다.
				int weight = seller.getPRODUCT_WEIGHT();
				// 8. 구매자: (내가 2.5kg 들 수 있나?)
				if(this.isEnoughWeight(weight* productCount)) {
					//		           들 수 있다!
					// 9. 구매자: 5개만 주시겠어요?
					// 10. 판매자: 두쫀쿠5개 포장해서 구매자에게 준다. (판매자의 재고 감소)
					int sellerStock = seller.getStock();
					sellerStock -= productCount;
					seller.setStock(sellerStock);
					// 11. 구매자: 여기 5천원 드릴께요. (구매자의 돈이 감소, 판매자의 자산 증가, 구매자의 무게와 구매 개수 증가)
					this.wallet -= price * productCount;
					int sellerAccount = seller.getAccount();
					sellerAccount += price * productCount;
					seller.setAccount(sellerAccount);
					
					this.nowCartWeight += weight * productCount;
					this.itemCount += productCount;
				}
				
			}
			
		}
		
		//           들 수 없다! -> 구매도 안하고 판매도 안한다.
		//           모자란다! -> 구매도 안하고 판매도 안한다.
		//           없어요! -> 구매도 안하고 판매도 안한다.
		
	}

}
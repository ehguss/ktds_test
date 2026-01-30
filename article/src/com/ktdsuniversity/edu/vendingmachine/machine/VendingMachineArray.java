package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.VendingMachine;

public class VendingMachineArray {
	
	// === RefundableDrinkVendingMachine을 위한 수정 시작 === //
	/**
	 * 자판기 자본금
	 */
	private int account;
	
	private int receivedPrice;
	
	// === RefundableDrinkVendingMachine을 위한 수정 끝 === //
	
	private VendingMachine[] drinks;
	
	
//	VendingMachine name;
//	VendingMachine price;
//	VendingMachine stockInQuantity;
	
	/**
	 * 박카스, 몬스터, 핫식스, 밀키스를 하나의 배열에 넣는다.
	 * @param bacchus - 박카스
	 * @param monster - 몬스터
	 * @param hotSix - 핫식스
	 * @param milkiss - 밀키스
	 */
	public VendingMachineArray(VendingMachine drink1, VendingMachine drink2,VendingMachine drink3, VendingMachine drink4) {
		this.drinks = new VendingMachine[4];
		this.drinks[0] = drink1;
		this.drinks[1] = drink2;
		this.drinks[2] = drink3;
		this.drinks[3] = drink4;
	}

	public int getAccount() {
		return this.account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public int getReceivedPrce() {
		return this.receivedPrice;
	}


	public void setReceivedPrice(int receivedPrice) {
		this.receivedPrice = receivedPrice;
	}


	public VendingMachine[] getDrinks() {
		return this.drinks;
	}


	public void setDrinks(VendingMachine[] drinks) {
		this.drinks = drinks;
	}

	/**
	 * <pre>
	 * 주문하기(제품번호, 주문수량): 구매금액(int)
	 * 몬스터를 5개 주문한다면 7500을 반환한다.
	 * 주문을 하면 주문 수량만큼 자판기 음료수의 재고가 감소된다.
	 * 재고가 없다면 “상품이 품절되었습니다“를 출력하고 0을 반환한다.
	 * </pre>
	 * @param menu 제품번호
	 * @param quantity 메뉴 주문 수량
	 */
	public int orderVendingMachine(int menu, int quantity, int receivedPrice) {
		
		// === RefundableDrinkVendingMachine을 위한 수정 시작 === //
		this.receivedPrice = receivedPrice;
		// === RefundableDrinkVendingMachine을 위한 수정 끝 === //
		
		// 주문가능 메뉴가 아닌 경우
		if(menu < 0 || menu >= this.drinks.length) {
			System.out.println("존재하지 않는 메뉴입니다.주문이 불가능합니다.");
			return 0;
		}
		
		//menu 인덱스를 가지고 와서 drink에 넣는다.
		VendingMachine drink = this.drinks[menu];
		
		// 주문 가능 수량을 넘은 경우
		if(drink.getStockInQuantity() < quantity) {
			System.out.println("재고가 부족합니다. 수량을 다시 선택해주세요.");
			return 0;
		}
		
		//주문 가능한 경우
		//재고에서 판매수량 빼기
		drink.setStockInQuantity(drink.getStockInQuantity() - quantity);
		int saleprice = drink.getPrice() * quantity;
		System.out.println(drink.getName() + " 음료를 " + quantity + "개 주문 했습니다.");
		
		// === RefundableDrinkVendingMachine을 위한 수정 시작 === //
		this.account += saleprice;
		this.receivedPrice -= saleprice;	// -가 된다면 돈을 더 넣어야하고 + 이면 환불 진행
		// === RefundableDrinkVendingMachine을 위한 수정 끝 === //
		
		return drink.getPrice() * quantity;	
		
	}
	
	/**
	 * <pre>
	 * 입고하기(제품번호, 입고수량): void
	 * 입고를 하면 입고 수량만큼 재고가 증가된다.
	 * 밀키스 3개를 입고하면, 밀키스의 재고가 3개 증가된다.
	 * 자판기에 없는 음료수는 입고할 수 없다. (제로콜라, 3)  아무 변화가 없다!
	 * </pre>
	 * @param menu 제품번호
	 * @param stockInQuantity 입고 수량
	 */
	public void stockInVendingMachine(int menu, int stockInQuantity) {
		
		// 자판기에 없는 음료수는 입고할 수 없다.
		if(menu < 0 || menu >= this.drinks.length) {
			System.out.println("존재하지 않는 메뉴입니다. 입고처리가 불가능합니다.");
			return;
		}
		
		//menu 인덱스를 가지고와서 stockInQuantity의 값을 증가한다.
		VendingMachine drink = this.drinks[menu];
		drink.setStockInQuantity(drink.getStockInQuantity() + stockInQuantity);
		System.out.println(drink.getName() + " 의 음료가" + stockInQuantity +"개 만큼 추가입고되었습니다.");
	}
	
	/**
	 * 모든 상품 재고 출력() : void
	 * 출력형식  “박카스 15개 남았습니다.”
	 */
	public void printAllStockInQuantity() {
		
		for(int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStockInQuantity()+"개 남았습니다.");
		}
	}
}

package com.ktdsuniversity.edu.homework.shop;

import com.ktdsuniversity.edu.homework.shop.consumer.Consumer;
import com.ktdsuniversity.edu.homework.shop.item.Mart;
import com.ktdsuniversity.edu.homework.shop.item.Stuff;

/**
 * 판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
 * 동시에, 구매자에게 구매금액의 0.1% 만큼의 포인트를 지급합니다.
 * 구매자의 포인트가 100점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
 * 단, 포인트는 전액 사용해야 합니다. (상품 금액이 포인트보다 작을 때에도 전액 사용해야합니다.)
 * 예를 들어, 구매자에게 2000의 포인트가 있고 5000원 상당의 상품을 구매할 때, 
 * 구매자는 3000원만 지불합니다. 그리고 구매자는 5000원의 0.1%만큼의 포인트를 지급받습니다.
 * 또 다른 구매자에게는 3000의 포인트가 있고 7000원 상당의 상품을 구매할 때, 
 * 15000원을 지불하면 판매자는 15000 - (7000-3000)만큼을 거슬러 줍니다. 
 * 그리고 구매자는 7000원의 0.1%만큼의 포인트를 지급받습니다.
 */
public class ConvenienceStore extends Mart{
	
	
	public ConvenienceStore(String martName, Stuff stuff1, Stuff stuff2, Stuff stuff3) {
		super(martName, stuff1, stuff2, stuff3);
		// TODO Auto-generated constructor stub
	}

	// 구매자의 포인트가 100점이 넘어가면 현금으로 사용 가능 
	//-> 110원 있으면 110원이 현금으로 됨.
	// 그리고 포인트를 사용한다면 그 이후 포인트는 0이 됨.(한번에 다써야함)
	
	public void getCPoint(Consumer consumer) {
	
		double pointMoney = super.getSaleprice() * 0.001;
		int consumerPoint = consumer.getPoint();
		consumerPoint += pointMoney;
		
		consumer.setPoint(consumerPoint);
		System.out.println(consumer.getName() + "님 포인트  " + (int)pointMoney + "원이 적립되었습니다.");
	}
	
	public int useCPoint(Consumer consumer) {
		// 사용자의 포인트 확인 후 조건에 해당된다면 포인트 사용하기
		// 단 포인트는 다 써야 한다.
		// 포인트 금액보다 적은 돈을 지불할 경우에도 포인트는 0이 된다.	
		int consumerPoint = consumer.getPoint();
		if(consumerPoint > 100) {
			System.out.println("포인트가 "+ consumerPoint +"원 사용되었습니다.");
			consumer.setPoint(0);
			return consumerPoint;
		}
		else {
			System.out.println("가용포인트가 없습니다.");
		}
		return consumer.getAccount();
	}

}

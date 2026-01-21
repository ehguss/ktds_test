package oop;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer kimDoHyeon = new Consumer();
		
		//손님 여부
		boolean isConsumerEnter = true;
		//손님이 앉았는지 여부
		boolean isConsumerSit = true;
		kimDoHyeon.isConsumerCanGetMenu(isConsumerEnter, isConsumerSit);
		
		//손님의 주문목록
		kimDoHyeon.orderMenuList = new String[]{"피자", "파스타", "스파게티", "연어샐러드", "와인", "콜라"};
		//손님이 받은 음식목록
		kimDoHyeon.serveMenuList = new String[]{"콜라", "피자", "파스타", "스파게티", "연어샐러드", "와인"};
		
		kimDoHyeon.isCanEat();
		
		kimDoHyeon.isConsumerEatAll = true;
		kimDoHyeon.isConsumerCanGo = true;
		
		kimDoHyeon.isCanPay();
		
		int cardBalance = 100_000;
		int foodFee = 80_000;
		kimDoHyeon.pay(cardBalance, foodFee);
	}
		
	

}

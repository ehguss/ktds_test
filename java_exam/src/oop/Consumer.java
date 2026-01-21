package oop;

import java.util.Arrays;

/**
 * <pre>
 * 식당에서 식사하는 손님
 * 
 * 손님이 식당 문을 열고 들어오면
 * 서버가 손님을 자리로 안내한다.
 * 자리에 앉은 손님은 메뉴판을 서버로부터 받아
 * 메뉴판을 본다.
 * 메뉴를 다 고른 손님은 서버를 불러서
 * 메뉴를 주문한다.
 * 메뉴를 주문한 손님은 음식 나오길 기다린다.
 * 서버가 손님이 주문한 음식을 알맞게 서빙해준다.
 * 손님은 자기가 주문한 음식이 맞는지 확인한다.
 * 주문한 음식이 맞다면 먹는다.
 * 먹는 동안 리필이 필요하면 서버를 부른다.
 * 다 먹은 손님은 옷과 짐을 챙기고 나갈 준비를 한다.
 * 손님은 카운터로가서 결제를 한다.
 * 결제를 다한 손님 중 주차를 했다면 캐셔에게 주차등록이 가능한지 물어본다.
 * 주차등록이 가능하다면 등록을 한다.
 * 결제와 주차등록이 완료되었다면 식당을 나온다.
 * </pre>
 */
public class Consumer {
	/**
	 * 손님의 메뉴판 소지여부
	 */
	boolean isConsumerGetMenuList;
	
	/**
	 * <pre>
	 * 서버가 메뉴판을 줘도 되는지 확인하는 메소드
	 * </pre>
	 * @param isConsumerEnter 손님이 들어왔는지 여부
	 * @param isConsumerSit 손님이 자리에 착석했는지 여부
	 */
	public void isConsumerCanGetMenu(boolean isConsumerEnter, boolean isConsumerSit) {
		if(isConsumerEnter == true) {
			if(isConsumerSit == true) {
				isConsumerGetMenuList = true;
				System.out.println("어서오세요. 메뉴판을 보고 음식을 주문해주세요.");
			}
			else {
				isConsumerGetMenuList = false;
				System.out.println("어서오세요. 곧 자리를 배정해드리겠습니다.");
			}
		}
		else {
			isConsumerGetMenuList = false;
			System.out.println("손님이 없습니다.");
		}
	}

	/**
	 * 손님의 메뉴 주문목록
	 */
	
	String[] orderMenuList;
	
	/**
	 * 손님의 메뉴 주문 개수
	 */
	int orderMenuCnt;
	
	/**
	 * 서빙된 음식 리스트
	 */
	String[] serveMenuList = {"피자", "파스타", "스파게티", "연어샐러드", "와인", "콜라"};
	
	/**
	 * 주문한 음식이 다 제대로 나왔는지 여부
	 */
	boolean isCorrectOrderMenu;
	
	/**
	 * 손님이 식사를 다 했는지 여부
	 */
	boolean isConsumerEatAll;
	
	/**
	 * 나갈 준비를 다 했는지 여부
	 */
	boolean isConsumerCanGo;
	
	/**
	 * 손님이 값을 지불할 준비가 되어 캐셔가 돈을 받을 준비를 해야하는지 여부
	 */
	boolean isCasherGetReady;
	
	/**
	 * 음식을 먹어도되는지 여부
	 */
	boolean isConsumerCanEat;
	
	/**
	 * 주문한 음식이 다 나왔는지 확인 후 먹어도 되는지 확인하는 메소드
	 */
	public void isCanEat() {
		
		//손님의 주문목록 정렬
		Arrays.sort(orderMenuList);
		
		//서빙된 음식 리스트 정렬
		Arrays.sort(serveMenuList);
		
		orderMenuCnt = orderMenuList.length;
		
		for(int i = 0; i < orderMenuCnt; i++) {
			if(orderMenuList[i] == serveMenuList[i]) {
				isCorrectOrderMenu = true;
			}
			else {
				isCorrectOrderMenu = false;
				break;
			}
		}
		if(isConsumerGetMenuList == true) {
			if(isCorrectOrderMenu == true) {
				isConsumerCanEat = true;
				System.out.println("주문한 음식이 제대로 나왔습니다. 식사를 해도 됩니다.");
			}
			else {
				isConsumerCanEat = false;
				System.out.println("주문한 음식이 제대로 나오지 않았습니다. 서버를 호출하세요.");
			}
		}
		else {
			isConsumerCanEat = false;
			System.out.println("메뉴주문 전입니다.");
		}
	};
	
	/**
	 * 손님이 식사 후 계산대로 가도되는지 확인하는 메소드
	 */
	public void isCanPay() {
		if(isConsumerCanEat == true) {
			if(isConsumerEatAll == true) {
				if(isConsumerCanGo == true) {
					isCasherGetReady = true;
					System.out.println("식사와 나갈준비를 다 마치셨네요. 계산대로 가서 음식 값을 지불하세요.");
				}
				else {
					isCasherGetReady = false;
					System.out.println("놓고 간 물건이 있는지 다시 확인하세요.");
				}
			}
			else {
				isCasherGetReady = false;
				System.out.println("손님이 아직 식사중입니다.");
			}
		}
		else {
			isCasherGetReady = false;
			System.out.println("음식이 안나왔습니다.");
		}
	}
	
	/**
	 * <pre>
	 * 계산하는 메소드
	 * </pre>
	 * @param consumerCardBalance 손님카드잔액
	 * @param foodFee 지불해야하는 음식 값
	 */
	
	public void pay(int consumerCardBalance, int foodFee) {
		if(isCasherGetReady == true) {
			if(consumerCardBalance >= foodFee) {
				System.out.println("정상결제되었습니다. 감사합니다.");
			}
			else {
				System.out.println("잔액부족으로 결제 실패입니다. 다른카드를 사용해주세요.");
			}
		}
		else {
			System.out.println("계산할 준비가 안되었습니다.");
		}
	}
	
}

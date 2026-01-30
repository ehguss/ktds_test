package com.ktdsuniversity.edu.homework.shop;

import java.util.Scanner;

import com.ktdsuniversity.edu.homework.shop.consumer.Consumer;
import com.ktdsuniversity.edu.homework.shop.consumer.VIP;
import com.ktdsuniversity.edu.homework.shop.consumer.VVIP;
import com.ktdsuniversity.edu.homework.shop.item.Stuff;

/**
 * 백화점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.5%의 포인트를 지급합니다.
 * 또 고객의 등급에 따라 차등 할인 혜택을 제공합니다.
 * 고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
 * 고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
 * 고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
 * 고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다. - 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.
 */
public class DepartmentStore extends ConvenienceStore{

	public DepartmentStore(String martName, Stuff stuff1, Stuff stuff2, Stuff stuff3) {
		super(martName, stuff1, stuff2, stuff3);
		// TODO Auto-generated constructor stub
	}

	public void getPoint(Consumer consumer) {
		
		if( consumer instanceof VVIP) {
//			고객의 등급이 VVIP인 경우 3%의 포인트를 지급 받습니다.
			double pointMoney = super.getSaleprice() * 0.03;
			int consumerPoint = consumer.getPoint();
			consumerPoint += pointMoney;
			
			consumer.setPoint(consumerPoint);
			System.out.println(consumer.getName() + "님 포인트  " + (int)pointMoney + "원이 적립되었습니다.");

		}
		else if( consumer instanceof VIP ) {
			//고객의 등급이 VIP등급일 경우 포인트를 지급받지 못합니다.
			return;
		}
		else if( consumer instanceof Consumer) {
			//고객의 등급이 일반등급일 경우 0.5%포인트를 지급받습니다.
			double pointMoney = super.getSaleprice() * 0.005;
			int consumerPoint = consumer.getPoint();
			consumerPoint += pointMoney;
			
			consumer.setPoint(consumerPoint);
			System.out.println(consumer.getName() + "님 포인트  " + (int)pointMoney + "원이 적립되었습니다.");

		}

	}

	public int discount(Consumer consumer) {
		
		int discount = 0;
		if( consumer instanceof VVIP) {
//			고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받습니다.
			
			return discount;

		}
		else if( consumer instanceof VIP ) {
//			고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다.
			
			return discount;
		}
		else if( consumer instanceof Consumer) {
			//고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못합니다.
			
			return 0;
		}
		return discount;
	}
	
	public int usePoint(Consumer consumer) {
//		고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다. - 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.	
		int consumerPoint = consumer.getPoint();
		
		if(consumerPoint > 10000) {
			Scanner sc = new Scanner(System.in);
			System.out.print("포인트로 사용할 금액을 입력하세요 : ");
			int wantUsePoint = sc.nextInt();
			System.out.println("포인트가 "+ wantUsePoint +"원 사용되었습니다.");
			consumer.setPoint(consumerPoint - wantUsePoint);
			return consumerPoint;
		}
		else {
			System.out.println("가용포인트가 없습니다.");
			return 0;
		}
		
	}
}

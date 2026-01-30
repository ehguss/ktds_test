package com.ktdsuniversity.edu.abstracts;

import java.util.Scanner;

public class DepartmentStore extends AbstractMart{

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	/**
	 * 고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
	 * 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.
	 */
	@Override
	public int usePoint(Guest guest) {
		
		Scanner sc = new Scanner(System.in);
		int point = guest.getPoint();
		
		System.out.print("사용할 포인트 금액을 정해주세요 : ");
		int usePoint = sc.nextInt();
		if(point >= 10_000) {
			guest.usePoint(usePoint);
			return point;
		}
		return 0;
	}

	/**
	 * 고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 0.5% 지급받습니다.
	 * 고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
	 * 고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
	 */
	@Override
	public void givePoint(Guest guest, int amount) {

		if( guest instanceof VVIP) {
			int point = (int)(amount * 0.03);
			guest.addPoint(point);
		}
		else if(guest instanceof VIP) {
			return;
		}
		else if(guest instanceof Guest) {
			int point = (int)(amount * 0.005);
			guest.addPoint(point);
		}
	}

	/**
	 * 고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
	 * 고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
	 * 고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
	 */
	@Override
	public int discount(Guest guest, int amount) {
		/*
		 * Guest : Guest is a Guest
		 *  - VIP : VIP is a Guest
		 *  	- VVIP : VVIP is a VIP and Guest
		 */
//		if(guest instanceof Guest g && guest instanceof VIP v) {
//			return 0;
//		}
//		else if(guest instanceof VVIP vv) {
//			int discount = (int)(amount * 0.1);
//			return discount;
//		}
//		return 0;
		
		if(guest instanceof VVIP) {
			int discount = (int)(amount * 0.1);
			System.out.println("discount : " + discount);
			return discount;
		}
		else if(guest instanceof VIP) {
			int discount = (int)(amount * 0.03);
			return discount;
		}
		else if(guest instanceof Guest) {
			return 0;
		}
		return 0;
	}

}

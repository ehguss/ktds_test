package com.ktdsuniversity.edu.inheritance.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.VendingMachine;
import com.ktdsuniversity.edu.vendingmachine.machine.VendingMachineArray;

public class RefundableDrinkVendingMachine extends VendingMachineArray{
	
	// 환불이 가능한 자판기

	public RefundableDrinkVendingMachine(VendingMachine drink1, VendingMachine drink2, VendingMachine drink3,
			VendingMachine drink4) {
		super(drink1, drink2, drink3, drink4);
	}

	// 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을때 환불 진행
	public void refund() {
		int remainMoney = super.getReceivedPrce();
		//받은 금액과 판매금액 비교하여 받은 돈이 더 많다면 환불
		//이때 자본금에서 cashReceived 더하고 거스름돈 (cashReceived - saleprice) 를 빼기
		if(remainMoney > 0) {
			System.out.println(remainMoney + "원이 환불 되었습니다. ");
		}
		//받은 금액과 판매금액이 일치하는 경우 환불진행 x
	}
}

package com.ktdsuniversity.edu.inheritance.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.VendingMachine;
import com.ktdsuniversity.edu.vendingmachine.machine.VendingMachineArray;

public class RefundableDrinkVendingMachineTest {
	
	public static void main(String[] args) {
		
		VendingMachine 박카스 = new VendingMachine("박카스", 900, 15);
		VendingMachine 몬스터 = new VendingMachine("몬스터", 1500, 20);
		VendingMachine 핫식스 = new VendingMachine("핫식스", 1300, 10);
		VendingMachine 밀키스 = new VendingMachine("밀키스", 1400, 5);
		VendingMachineArray machine = new RefundableDrinkVendingMachine(박카스, 몬스터, 핫식스, 밀키스);
		
		int orderMoney = machine.orderVendingMachine(1, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		orderMoney = machine.orderVendingMachine(6, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
	}

}

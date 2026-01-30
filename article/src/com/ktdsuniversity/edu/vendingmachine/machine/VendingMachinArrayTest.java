package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.VendingMachine;

public class VendingMachinArrayTest {

//	VendingMachine name;
//	VendingMachine price;
//	VendingMachine stockInQuantity;
//	
//	public VendingMachinArrayTest(VendingMachine name, VendingMachine price, VendingMachine stockInQuantity) {
//		this.name = name;
//		this.price = price;
//		this.stockInQuantity = stockInQuantity;
//	}
	
	public static void main(String[] args) {
		
		//지역변수
		VendingMachine bacchus = new VendingMachine("bacchus", 1_000, 5);
		VendingMachine monster = new VendingMachine("monster", 1_500, 4);
		VendingMachine hotSix = new VendingMachine("hotSix", 1_200, 8);
		VendingMachine milKis = new VendingMachine("milKis", 2_000, 10);
		
		VendingMachineArray inSubway = new VendingMachineArray(bacchus, monster, hotSix, milKis);

		
		int price = inSubway.orderVendingMachine(1, 3, 5000);
		System.out.println(price);

		price = inSubway.orderVendingMachine(0, 4, 5000);
		System.out.println(price);
		
		price = inSubway.orderVendingMachine(4, 3, 5000);
		System.out.println(price);
		
		price = inSubway.orderVendingMachine(5, 3, 5000);
		System.out.println(price);
		
		price = inSubway.orderVendingMachine(2, 3, 5000);
		System.out.println(price);
		
		price = inSubway.orderVendingMachine(1, 3, 5000);
		System.out.println(price);
		
		inSubway.stockInVendingMachine(1, 10);
		inSubway.stockInVendingMachine(2, 10);
		inSubway.stockInVendingMachine(3, 10);
		inSubway.stockInVendingMachine(4, 10);
		inSubway.stockInVendingMachine(5, 10);
		
		inSubway.printAllStockInQuantity();
	}

}

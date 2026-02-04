package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {

	public static void main(String[] args) {
		
		// coffee / coffeeShop 클래스에 생성자가 있고 따라서 기본생성자는 만들어지지 않는다. 
		// 따라서 생성한 생성자에 맞게 클래스를 선언해야한다.
		
		Coffee hotCoffee = new Coffee("아메리카노(Hot)", 4500, 100);
		Coffee iceCoffee = new Coffee("아이스티", 4000, 60);
//		Coffee tea = new Coffee("캐모마일", 4500);
		
		CoffeeShop starbucks = new CoffeeShop();
//		CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee);
		
		//오버로딩을 하지 않았을때
		int price = starbucks.orderCoffee(Menu.HOT, 3);
		System.out.println(price);
		
		price = starbucks.orderCoffee(Menu.COLD, 6);
		System.out.println(price);
		
		//메소드 오버로딩을 하게 되면 -> 파라미터사용안해도 됨.
		System.out.println("====== 오버로딩 시작 ======");
		price = starbucks.orderCoffee();
		System.out.println(price);
		
		price = starbucks.orderCoffee(Menu.COLD);
		System.out.println(price);
		System.out.println("====== 오버로딩 끝 ======");

//		CoffeeShopArray megaCoffee = new CoffeeShopArray(hotCoffee, iceCoffee, tea);
//		
//		price = megaCoffee.orderCoffee(3, 5);
//		System.out.println(price);
//
//		price = megaCoffee.orderCoffee(0, 10);
//		System.out.println(price);
//
//		price = megaCoffee.orderCoffee(1, 10);
//		System.out.println(price);
//
//		price = megaCoffee.orderCoffee(2, 10);
//		System.out.println(price);

		
	}
}

package com.ktdsuniversity.edu.homework.restaurant;

public class RestaurantTest {
		
	Restaurant outBack;
	
	Restaurant vips;
	
	Restaurant madForGarlic;
	
	public RestaurantTest(Restaurant outBack, Restaurant vips, Restaurant madForGarlic) {
		this.outBack = outBack;
		this.vips = vips;
		this.madForGarlic = madForGarlic;
	}
	
	public static void main(String[] args) {
		
		Guest kimDoHyeon = new Guest("김도현", 100, 10, 50_000, 5);
		Guest leeJaeYong = new Guest("이재용", 100, 10, 50_000, 5);
		Guest stevenJobs = new Guest("스티브잡스", 100, 10, 50_000, 5);
		
		
		Menu outBackCuisine = new Menu("스파게티", 10_000, 100);
		Menu outBackDrink = new Menu("와인", 5_000, 15);

		Menu vipsCuisine = new Menu("스파게티", 10_000, 100);
		Menu vipsDrink = new Menu("와인", 5_000, 15);

		Menu madForGarlicCuisine = new Menu("스파게티", 10_000, 100);
		Menu madForGarlicDrink = new Menu("와인", 5_000, 15);

		Restaurant outBack = new Restaurant("outBack", 10000, 10000);
		Restaurant vips = new Restaurant("vips", 100000, 10000);
		Restaurant madForGarlic= new Restaurant("madForGarlic", 100000, 10000);
		
		outBack.isGuestCanOrder(kimDoHyeon, 1);
		outBack.isGuestCanOrder(leeJaeYong, 1);
		
		
		
	}
}

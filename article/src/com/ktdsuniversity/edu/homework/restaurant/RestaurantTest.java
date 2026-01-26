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
		
		
		Menu outBackCuisine = new Menu("스파게티", 10, 100);
		Menu outBackDrink = new Menu("와인", 40 , 15);

		Menu vipsCuisine = new Menu("스파게티", 5, 100);
		Menu vipsDrink = new Menu("와인", 50 , 15);

		Menu madForGarlicCuisine = new Menu("스파게티", 8, 100);
		Menu madForGarlicDrink = new Menu("와인", 60 , 15);
		

		Restaurant outBack = new Restaurant("outBack", outBackCuisine, outBackDrink, 5000, 9980);
		Restaurant vips = new Restaurant("vips", vipsCuisine, vipsDrink, 8000, 10000);
		Restaurant madForGarlic= new Restaurant("madForGarlic", madForGarlicCuisine, madForGarlicDrink, 3000, 10000);

		
		outBack.isGuestCanOrder(kimDoHyeon, 2, 1);
		outBack.isGuestCanOrder(leeJaeYong, 3, 5);
		outBack.isGuestCanOrder(stevenJobs, 6, 6);
		vips.isGuestCanOrder(stevenJobs, 1000, 0);
		vips.isGuestCanOrder(kimDoHyeon, 5, 0);
		vips.isGuestCanOrder(leeJaeYong, 100, 0);
		madForGarlic.isGuestCanOrder(stevenJobs, 0, 2);
		madForGarlic.isGuestCanOrder(kimDoHyeon, 6, 0);
		madForGarlic.isGuestCanOrder(leeJaeYong, 5, 0);
		
		
		
	}
}

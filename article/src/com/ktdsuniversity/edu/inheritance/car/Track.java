package com.ktdsuniversity.edu.inheritance.car;

public class Track {

	public static void main(String[] args) {
		
		Vehicle carnival = new Vehicle("카니발", false, "부르릉!");
		SportsCar genesis = new SportsCar("제네시스", false, false);
		EV ioniq5 = new EV("아이오닉5", false, 80);
		
		BatMobile batmobile = new BatMobile("배트모빌", false, false);
		
		carnival.startEngine(carnival);
		genesis.startEngine(genesis);
		ioniq5.startEngine(ioniq5);
		
		ioniq5.batteryCheck(ioniq5);
		
		genesis.turboMode(genesis);
		batmobile.seperateBatPort(genesis);
	}
}

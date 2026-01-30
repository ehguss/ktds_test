package com.ktdsuniversity.edu.implement;

public class Test {

	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
//		lgTV.turnOff();
//		lgTV.turnOn();
//		lgTV.runNetflix();
//		lgTV.runYoutube();
//		lgTV.turnOff();
		
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTV);
		lgRemoteCon.runYoutube(lgTV);
			

		SamsungSmartTV samsungTV = new SamsungTV();
//		samsungTV.turnOn();
//		samsungTV.runCoupangPlay();
//		samsungTV.runNetflix();
//		samsungTV.runMenu();
//		samsungTV.turnOff();
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
		lgRemoteCon.turnOn(samsungTV);
	}
}

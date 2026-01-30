package com.ktdsuniversity.edu.implement;

public class SamsungSmartRemoteController implements SamsungRemoteController{

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
	}

	@Override
	public void turnOff(TV tv) {
		tv.turnOff();
	}

	@Override
	public void changeChannel(TV tv, int channelNumber) {
		tv.changeChannel(channelNumber);
	}

	@Override
	public void changeVolumn(TV tv, int volumn) {
		tv.changeVolumn(volumn);
	}

	@Override
	public void runNetflix(SamsungSmartTV tv) {
		tv.runNetflix();
	}

	@Override
	public void runMenu(SamsungSmartTV tv) {
		tv.runMenu();		
	}

	@Override
	public void runCoupangPlay(SamsungSmartTV tv) {
		tv.runCoupangPlay();
	}

}

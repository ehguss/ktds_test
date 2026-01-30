package com.ktdsuniversity.edu.implement;

public class LgTV implements LgSmartTV {

	@Override
	public void turnOn() {
		System.out.println("엘지 티비의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("엘지 티비의 전원을 끕니다.");
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("엘지 티비의 채널을 바꿉니다." + channelNumber);
	}

	@Override
	public void changeVolumn(int volumn) {
		System.out.println("엘지 티비의 볼륨을 바꿉니다." + volumn);		
	}

	@Override
	public void runNetflix() {
		System.out.println("엘지 티비의 넷플릭스를 실행합니다.");		
	}

	@Override
	public void runInternet() {
		System.out.println("엘지 티비의 인터넷을 실행합니다.");		
	}

	@Override
	public void runYoutube() {
		System.out.println("엘지 티비의 유튜브를 실행합니다.");		
	}

}

package com.ktdsuniversity.edu.inheritance.car;

public class BatMobile extends SportsCar{
	
	private boolean isBatPort;
	
	public BatMobile(String carName, boolean isStartEngine, boolean isBatPort) {
		super(carName, "부아아아아아아아앙!!");
		this.isBatPort = isBatPort;
	}

	
	public boolean isBatPort() {
		return isBatPort;
	}


	public void setBatPort(boolean isBatPort) {
		this.isBatPort = isBatPort;
	}


	//시동걸기
	
	//터보모드
	
	//배트포트 분리
	public void seperateBatPort(Vehicle carName) {
		this.isBatPort = true;
		System.out.println(carName.getCarName() + " 차의 배트포트가 분리되었습니다.");
	}
	

}

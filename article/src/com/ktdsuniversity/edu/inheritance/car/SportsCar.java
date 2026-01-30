package com.ktdsuniversity.edu.inheritance.car;

public class SportsCar extends Vehicle{
	
	private boolean isTurboMode;
	
	public SportsCar(String carName, String engineSound) {
		super(carName, false, engineSound);
	}
	
	public SportsCar(String carName, boolean isStartEngine, boolean isTurboMode) {
		super(carName, isStartEngine, "부아앙");
		this.isTurboMode = isTurboMode;
	}
	
	public boolean isTurboMode() {
		return isTurboMode;
	}


	public void setTurboMode(boolean isTurboMode) {
		this.isTurboMode = isTurboMode;
	}

	//시동걸기
	
	//터보모드
	public void turboMode(Vehicle carName) {
		this.isTurboMode = true;
		System.out.println(carName.getCarName() + "차의 터보모드가 실행되었습니다.");
	}
	
	
}

package com.ktdsuniversity.edu.inheritance.car;

public class EV extends Vehicle{

	private int batteryAmount;
	
	public EV(String carName, boolean isStartEngine, int batteryAmount) {
		super(carName, isStartEngine, "위이잉!");
		this.batteryAmount = batteryAmount;
	}

	//시동걸기
	
	//배터리체크
	public void batteryCheck(Vehicle carName) {
		System.out.println(carName.getCarName() + " 이 차의 배터리는 " + this.batteryAmount + "입니다.");
	}
}

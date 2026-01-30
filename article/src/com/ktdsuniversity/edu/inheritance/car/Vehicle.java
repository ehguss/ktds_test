package com.ktdsuniversity.edu.inheritance.car;

public class Vehicle {

	private String carName;
	
	private boolean isStartEngine;
	
	private String engineSound;
	
	public Vehicle(String carName) {
		this.carName = carName;
		this.engineSound = "부르릉!";
	}
	public Vehicle(String carName, boolean isStartEngine, String engineSound) {
		this.carName = carName;
		this.isStartEngine = isStartEngine;
		this.engineSound = engineSound;
	}
	
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public boolean isStartEngine() {
		return isStartEngine;
	}

	public void setStartEngine(boolean isStartEngine) {
		this.isStartEngine = isStartEngine;
	}

	public void startEngine(Vehicle carName) {
		if(this.isStartEngine == false) {
			this.isStartEngine = true;
			System.out.println(this.carName + "의 시동이 걸렸습니다.");
			System.out.println(this.engineSound);
		}
		else {
			this.isStartEngine = false;
			System.out.println(this.carName + "의 시동을 껐습니다.");
		}
	}
}


package com.ktdsuniversity.edu.homework.flight;

public class FlightSeat {
	
	private int seatNumber;
	private boolean isCanReserve;
	
	public FlightSeat(int seatNumber, boolean isCanReserve) {
		this.seatNumber = seatNumber;
		this.isCanReserve = isCanReserve;
	}
	
	int getSeatNumber() {
		return seatNumber;
	}

	void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	boolean isCanReserve() {
		return isCanReserve;
	}

	void setCanReserve(boolean isCanReserve) {
		this.isCanReserve = isCanReserve;
	}
	
	@Override
	public String toString() {
		String possible = "";
		if(isCanReserve) {
			possible = "O";
		}
		else {
			possible = "X";
		}
		return seatNumber + ":" + possible;
	}
}

package com.ktdsuniversity.edu.anonymous;

import com.ktdsuniversity.edu.abstracts.AbstractMart;
import com.ktdsuniversity.edu.abstracts.Guest;
import com.ktdsuniversity.edu.implement.TV;

public class AnonymousClass {
	
	public static void main(String[] args) {
		//The type new AbstractMart(){} must implement the inherited abstract method AbstractMart.usePoint(Guest)
		AbstractMart mart = new AbstractMart(4500) {

			@Override
			public int usePoint(Guest guest) {
				return 0;
			}
	
			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(10_000_000);
				
			}
	
			@Override
			public int discount(Guest guest, int amount) {
				return amount;
			}};
			
		Guest guest = new Guest(0, 0);
		mart.sell(guest, 10000, 0);
		System.out.println(guest);
		
		TV emartTV = new TV() {

			@Override
			public void turnOn() {
				System.out.println("이마트~");
			}

			@Override
			public void turnOff() {
				System.out.println("이마트~끔");
			}

			@Override
			public void changeChannel(int channelNumber) {
				System.out.println("이마트~채널 변경");
			}

			@Override
			public void changeVolumn(int volumn) {
				System.out.println("이마트~ 볼륨 변경");
			}};
			
		emartTV.turnOn();
		emartTV.turnOff();
		emartTV.changeChannel(0);
		emartTV.changeVolumn(0);
		
		System.out.println(mart);
		System.out.println(emartTV);
	}
		
}

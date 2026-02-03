package com.ktdsuniversity.edu.homework.flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Flight {

	public static void printFlight(Map<Integer, List<FlightSeat>> classes, int flightSchedule) {
		
		List<FlightSeat> flightSeats = classes.get(flightSchedule);
		
		if(flightSeats != null) {
			
			for(FlightSeat flightSeat : flightSeats) {
				System.out.print(flightSeat + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Map<Integer, List<FlightSeat>> classes = new HashMap<>();
		
		classes.put(1, new ArrayList<>());
		classes.put(2, new ArrayList<>());
		classes.put(3, new ArrayList<>());
		classes.put(4, new ArrayList<>());
		classes.put(5, new ArrayList<>());
		
		List<FlightSeat> flightSeat = classes.get(1);
		flightSeat.add( new FlightSeat(1, true));
		flightSeat.add( new FlightSeat(2, true));
		flightSeat.add( new FlightSeat(3, true));
		flightSeat.add( new FlightSeat(4, false));
		flightSeat.add( new FlightSeat(5, true));
		flightSeat.add( new FlightSeat(6, true));
		flightSeat.add( new FlightSeat(7, false));
		flightSeat.add( new FlightSeat(8, true));
		flightSeat.add( new FlightSeat(9, true));
		
		flightSeat = classes.get(2);
		flightSeat.add( new FlightSeat(1, true));
		flightSeat.add( new FlightSeat(2, true));
		flightSeat.add( new FlightSeat(3, true));
		flightSeat.add( new FlightSeat(4, false));
		flightSeat.add( new FlightSeat(5, true));
		flightSeat.add( new FlightSeat(6, true));
		flightSeat.add( new FlightSeat(7, false));
		flightSeat.add( new FlightSeat(8, true));
		flightSeat.add( new FlightSeat(9, true));
		
		flightSeat = classes.get(3);
		flightSeat.add( new FlightSeat(1, true));
		flightSeat.add( new FlightSeat(2, true));
		flightSeat.add( new FlightSeat(3, true));
		flightSeat.add( new FlightSeat(4, false));
		flightSeat.add( new FlightSeat(5, true));
		flightSeat.add( new FlightSeat(6, true));
		flightSeat.add( new FlightSeat(7, false));
		flightSeat.add( new FlightSeat(8, true));
		flightSeat.add( new FlightSeat(9, true));
		
		flightSeat = classes.get(4);
		flightSeat.add( new FlightSeat(1, true));
		flightSeat.add( new FlightSeat(2, true));
		flightSeat.add( new FlightSeat(3, true));
		flightSeat.add( new FlightSeat(4, false));
		flightSeat.add( new FlightSeat(5, true));
		flightSeat.add( new FlightSeat(6, true));
		flightSeat.add( new FlightSeat(7, false));
		flightSeat.add( new FlightSeat(8, true));
		flightSeat.add( new FlightSeat(9, true));
		
		flightSeat = classes.get(5);
		flightSeat.add( new FlightSeat(1, true));
		flightSeat.add( new FlightSeat(2, true));
		flightSeat.add( new FlightSeat(3, true));
		flightSeat.add( new FlightSeat(4, false));
		flightSeat.add( new FlightSeat(5, true));
		flightSeat.add( new FlightSeat(6, true));
		flightSeat.add( new FlightSeat(7, false));
		flightSeat.add( new FlightSeat(8, true));
		flightSeat.add( new FlightSeat(9, true));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
		System.out.print("비행기 편의 이름을 입력하세요: ");
		int flightSchedule = Integer.parseInt(sc.nextLine());
		
		while(classes.get(flightSchedule) == null) {
			System.out.println("\"000" + flightSchedule + "\"" + "편은 존재하지 않습니다.");
			System.out.print("다른 비행기 편의 이름을 입력하세요: ");
			flightSchedule = Integer.parseInt(sc.nextLine());
		}
		System.out.println("\"000" + flightSchedule + "\"" + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
		printFlight(classes, flightSchedule);
		
		String bookingStatus = null;
		for(int i = 0; i < classes.get(flightSchedule).size(); i++) {
			bookingStatus += classes.get(flightSchedule).get(i).isCanReserve() +"";
		}

		boolean isCanReserve = bookingStatus.contains("true");
		
		while(!isCanReserve) {
			System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
			return;
		}
		
		System.out.println("\n");
		System.out.print("좌석 예약을 하려면 번호를 입력하세요:");
		int seatNum = Integer.parseInt(sc.nextLine());
		
		while(!classes.get(flightSchedule).get(seatNum-1).isCanReserve()) {
			System.out.println("\"" + seatNum + "\"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요:" );
			seatNum = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("\"" + seatNum + "\"번 좌석을 예약하시겠습니까? (y/N): ");
		String isConfirmed = sc.nextLine();
		
		if(isConfirmed.toLowerCase().equals("n")) {
			System.out.println("\"" + seatNum + "\"번 좌석 예약을 취소하셨습니다.");
		}
		else {
			classes.get(flightSchedule).get(seatNum-1).setCanReserve(false);
			System.out.println("\"" + seatNum + "\"번 좌석이 예약되었습니다.");
		}
	
	}
}

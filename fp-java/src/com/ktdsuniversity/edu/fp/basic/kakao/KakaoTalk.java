package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.time.Period;

public class KakaoTalk {

	public static void main(String[] args) {
		FriendList fl = new FriendList();
		
		fl.add(new Friend("A", "2000-01-01"));
		fl.add(new Friend("B", "2001-11-01"));
		fl.add(new Friend("C", "2004-05-16"));
		fl.add(new Friend("D", "2001-02-28"));
		fl.add(new Friend("E", "2001-02-04"));
		fl.add(new Friend("F", "2001-02-09"));
		fl.add(new Friend("G", "2001-01-30"));
		fl.add(new Friend("H", "2001-02-01"));
		
//		LocalDate 일때
		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
//		fl.printSpecialFriends( birthdate -> birthdate.isAfter( LocalDate.now() ) 
//										 && birthdate.isBefore( LocalDate.now().plusDays(8)));
		fl.printSpecialFriends2( friend -> {
			LocalDate birthdate = friend.getBirthdate().withYear( LocalDate.now().getYear());
			// 2000-01-01 -> 2026-01-01 로 변경
			return birthdate.isAfter( LocalDate.now() ) 
			    && birthdate.isBefore( LocalDate.now().plusDays(8));
		});
		System.out.println("오늘이 생일인 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isEqual(LocalDate.now()));
		fl.printSpecialFriends2( friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthdate = friend.getBirthdate().withYear( now.getYear());
			
			return birthdate.isEqual(now);
		});
		System.out.println("7일 이내에 생일이 지난 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isBefore(LocalDate.now())
//										&& birthdate.isAfter(LocalDate.now().minusDays(8)));
		fl.printSpecialFriends2( friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthdate = friend.getBirthdate().withYear( now.getYear());
			
			return birthdate.isBefore(LocalDate.now())
					&& birthdate.isAfter(LocalDate.now().minusDays(8));
		});
		
		// 오늘이 생일인 31세
		System.out.println("오늘 만 30세가 된 친구 목록");
		fl.printSpecialFriends2( friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthdate = friend.getBirthdate().withYear( now.getYear());
			
			return birthdate.isEqual(now) 
				&& friend.getBirthdate().getYear() + 30 == now.getYear();
		});
		
		//Period 사용해서 
		fl.printSpecialFriends2( friend -> {
			Period period = Period.between(friend.getBirthdate(), LocalDate.now());
			
			return period.getYears() == 30 && period.getMonths() == 0 && period.getDays() == 0;
		});
		
		System.out.println("이름이 'A'인 친구 목록");
		fl.printSpecialFriends2( friend -> friend.getName().equals("A"));
		
		System.out.println("이름이 '김'인 친구 목록");
		fl.printSpecialFriends2( friend -> friend.getName().startsWith("김"));
		
		System.out.println("이름이 '이'인 친구 목록");
		fl.printSpecialFriends2( friend -> friend.getName().equals("이"));
		
		System.out.println("전체 친구 목록");
//		System.out.println(fl);
		
		fl.printSpecialFriends(friend -> true);
	}
}

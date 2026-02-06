package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FriendList {

	private List<Friend> friends;
	
	public FriendList() {
		this.friends = new ArrayList<>();
	}
	
	public void add(Friend friend) {
		this.friends.add(friend);
	}
	
	public void printSpecialFriends(Search search) {
		
//		LocalDate tempBirthdate = null;
		
		for (Friend f : this.friends) {
			
			// LocalDate.now().minusDays(8) 에서 연도까지 계산되는 점을 위해 새로운 로컬데이트 생성
//			tempBirthdate = LocalDate.parse( f.getBirthdate().toString() );
			// 올해의 연도로 새로 생성 - 2001-01-30 -> 2026-01-30 으로 변환되어 tempBirthdate에 저장
//			tempBirthdate = tempBirthdate.withYear( LocalDate.now().getYear());
			
			
//			if(search.check(f.getBirthdate())) {
//				System.out.println(f);
//			}
			

			if(search.check(f)) {
				System.out.println(f);
			}
		}
	}
	
	public void printSpecialFriends2(Predicate<Friend> predicate) {
		
		for (Friend f : this.friends) {
			if(predicate.test(f)) {
				System.out.println(f);
			}
		}
	}
	
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		if(this.friends.size() == 0) {
			buffer.append("등록된 친구가 없습니다");
		}
		else {
			for(Friend f : this.friends) {
				buffer.append(f);
				buffer.append("\n");
			}
		}
		
		return buffer.toString();
	}

}

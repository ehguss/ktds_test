package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	
	public static void main(String[] args) {
		
		String name = "김도현";
		String other = "김도현";
		System.out.println(name == other);
		
		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥", 15f, 20f, 50f);
		
		System.out.println( "== 비교 " + (duck == duck2) );
		System.out.println( "equals 비교 " + duck.equals(duck2));
		duck.howling();
		duck.move();
		
		StringBuffer sb = new StringBuffer();
		sb.append(duck);
		System.out.println(sb);
		
		//옛날 버전
//		if(duck instanceof Bird) {
//			Bird bird = (Bird) duck;	//명시적 형변환 - bird(animal) -> bird(bird)
//			bird.fly();
//			bird.land();
//		}
		
		//현재 버전
		if(duck instanceof Bird bird) {		// duck이 Bird의 인스턴스가 맞다면 bird로 형변환해라
			bird.fly();
			bird.move();
			
			bird.land();
			bird.move();
			
			bird.fly();
		}
//		duck.fly();
//		duck.land();
		
		
		Animal lion = new Animal("사자", "크아앙", 80f, 60f, 200f);
		
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f);
		
		tiger.attack(duck);
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		
		tiger.attack(lion);
		
	}
}

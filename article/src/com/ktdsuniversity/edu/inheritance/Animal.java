package com.ktdsuniversity.edu.inheritance;

public class Animal {
	
	// 지역변수 선언
	private String name;
	
	private String voice;
	
	private float speed;
	
	private float damage;
	
	private float hitPoint;
	
	// 생성자 선언
	public Animal(String name, String voice, float speed, float damage, float hitPoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitPoint = hitPoint;
	}

	// getter(name만) 선언
	public String getName() {
		return this.name;
	}
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	// 메소드 선언 시작 
	public void howling() {
		System.out.println(this.name + " : " + this.voice);
	}
	
	public void move() {
		System.out.println(this.name + " : " + this.speed + "km/h 의 속도로 움직임");
	}
	
	public void attack(Animal other) {
		
		if(this.isDead()) {
			System.out.println("이미 죽어서 행동할 수 없습니다.");
			return;
		}
		
		//attack을 수행하는 내가 bird냐? 
		//&& other(는 bird가 아닐수도 있음 따라서 Bird로 형변환) 새냐?
		if(!(this instanceof Bird) && other instanceof Bird bird) {
			//bird가 날고 있으면 공격 불가
			if(bird.getIsFly()) {
				System.out.println(other.getName() + "가 비행 중이라 공격할 수 없습니다.");
				return;
			}
		}
		
		System.out.println(this.name + "가 " + other.getName() + "에게 공격하려 합니다.");
		if(!other.isDead()) {
			other.getDamage(this.damage);
		}
		else {
			System.out.println(other.getName() + "가 이미 죽었습니다.");
		}
	}
	
	public void getDamage(float damage) {
		System.out.println(this.name + "가 " + damage + "만큼 피해를 입었습니다.");
		this.hitPoint -= damage;
	}
	
	public boolean isDead() {
		return this.hitPoint <= 0;
	}
	// 메소드 선언 끝
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if( obj instanceof Animal other ) {
			return other.getName().equals(this.name);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Animal [name=" + this.name + ", voice=" + this.voice + ", speed=" + this.speed + ", damage=" + this.damage + ", hitPoint="+ this.hitPoint + "]";
	}
	
	
	
}

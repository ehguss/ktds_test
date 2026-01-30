package com.ktdsuniversity.edu.inheritance;

//조류도 animal에 포함되는 것이므로 animal을 확장한다.extends(상속)
//상속시 Animal(부모클래스)에 기본생성자가 아닌 다른 형태의 생성자가 존재한다면 bird(자식클래스)에도 animal(부모클래스)과 똑같은 형태의 생성자를 만들어주어야한다.
//부모클래스에 기본생성자가 있다면 자식클래스에 생성자를 만들어주지 않아도 된다.
public class Bird extends Animal{

	private boolean isFLy;
	
	private float walkingSpeed;
	
	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}

	public boolean getIsFly() {
		return this.isFLy;
	}
	public void fly() {
		this.isFLy = true;
		super.setSpeed(70f);
	}
	
	public void land() {
		this.isFLy = false;
		super.setSpeed(this.walkingSpeed);
	}

	// Bird 클래스의 최종 Super Class 인 Object클래스의 toString() 메소드를 다시 정의한다.
	@Override
	public String toString() {
		
		String str = "Bird [name : %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFLy);
	}
}

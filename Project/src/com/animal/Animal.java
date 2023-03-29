package com.animal;

public abstract class Animal { // 추상 클래스
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		// 초기화
		this.name = name;
		this.kinds = kinds;
	}
	
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. ";
	}
	
	// 클래스가 추상메서드를 포함 할 경우 추상 클래스가 되어야 함
	public abstract void speak(); // 추상 메소드

}

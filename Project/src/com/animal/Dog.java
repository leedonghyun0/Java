package com.animal;

public class Dog extends Animal{
	public static final String PLACE = "애견카페"; // 상수 -> static final
	private int weight;
	
	public Dog(){
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		this.weight = weight;
		// setWeight(weight);
	}

	public static String getPlace() {
		return PLACE;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() { // 추상 메소드 재정의
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}

}

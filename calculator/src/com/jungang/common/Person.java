package com.jungang.common;

public class Person {

	// 4개의 필드 정의
	protected String name;
	public int age;
	public double height;
	public double weight;

	// 기본생성자 : 초기화를 담당
	// 클래스 명과 같은 이름, 반환 타입이 없다.
	public Person() {
		// 다른 생성자를 호출
		// 초기화 값을 직접 입력
		// 매개변수의 타입과 갯수가 일치해야지만 호출 할 수 있다.
		this("정우성", 30, 170, 50);
	}

	public Person(String name, int age, double height, double weight) {
		// 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 접근제한자 반환타입 메서드명(매개변수 타입, 매개변수 명){ }
	/**
	 * 이름과 나이를 반환
	 * 
	 * @return 이름, 나이
	 */
	public String information();
	return name+","+age;

}

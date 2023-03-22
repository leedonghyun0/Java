package com.jungang;

public class Calculator {

	// 필드
	// 접근제한자를 붙이지 않으면 default
	String name;

	// 생성자의 특징 2가지
	// 1. 클래스의 이름과 동일한 이름을 가지고 있다.
	// 2. 반환타입이 없다!!
	// 생성자 : new 연산자를 만나서 객체가 생성될 때 실행됩니다.
	public Calculator() {
		name = "정수계산기";
		System.out.println(name);
	}

	// 접근제한자 반환타입 메서드명 (매 * 두개의 정수를 받아서 두 수의 합을 반환한다.
	

	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	/**
	 * 두개의 정수를 받아서 두 수의 차이를 반환한다.
	 * @param num3
	 * @param num4
	 * @return 두 수의 차
	 */
	public int sub(int num3, int num4) {
		return num3 - num4;
	}

	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public double div(double n3, double n4) {
		return n3/n4;
	}
	// 겨변수타입 변수명){}

}


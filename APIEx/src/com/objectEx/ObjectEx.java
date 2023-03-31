package com.objectEx;

/**
 * 1. API(Application Programming interface)
 * 	  - API는 운영체제나 프로그래밍 언어가 제공하는
 * @author user
 *
 */
public class ObjectEx {
	
	public static void main(String[] args) {
		String str = ""; // => Object
		print(str);
		System.out.println(("=================="));
		
		// 기본타입 : 값 자체가 저장
		// 참조타입 : 주소가 저장
		//    .   : 주소 접근연산자
		int num = 0;  //  => Interger => Object
		// int 타입은 기본타입 이므로 Object 타입으로 변환 되지 못합니다.
		// int 타입을 객체형태로 변환 해야 합니다.
		// ==> Wrapper 클래스인 Integer 타입으로 자동 형 변환 되어져서 들어간다.
		
		print(num);
		System.out.println(("=================="));
		ObjectEx objEx = new ObjectEx();
		print(objEx);
//		objEx.
		
		str.toString();
		// Integer.toString();
		// int -> Integer (자동 형 변환)
		// double -> Double
		// 기본타입 : 값 자체를 저장
		// 참조타입 : 주소를 저장한다
		// Integer.toString();
		
		// String
	}
	
	// Object => 참조타입의 최상위 계층
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의 되어 있지만
		// 메서드의 오버라이딩에 의해서
		// String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		// 클래스이름@16진수 주소값을 반환
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값을 비교합니다.
		// 주소가 같으면 true, 다르면 false
		obj.equals(new Object());
	}
}

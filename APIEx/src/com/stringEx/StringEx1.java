package com.stringEx;

public class StringEx1 {
	public static void main(String[] args) {
		// 7번째 인덱스의 문자가 
		// 1,3 : 남자
		// 2,4 : 여자
		String ssn = "123456-1234567";
		// charAt(7) :
		// 해당 인덱스의 문자를 char 타입으로 반환
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
			System.out.println("남자");
		} else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4'){
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값 입니다.");
		}
		// System.out.println(ssn.charAt(7));
	}
}

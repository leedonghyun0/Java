package com.jungang;

import com.kh.object.StaticSample;

public class StaticApplication {

	public static void main(String[] args) {
		// 정적 멤버 접근 : 필드가 private 접근제한자 이므로 클래스명.필드명 으로 직접 접근 안됨
		// StaticSample의 value 필드 값을 초기화
		
		StaticSample.setValue("Java"); // 정적 멤버 접근 -> 클래스명을 바로 접근
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper 메서드 실행 후 value값 출력
		// 메서드 호출
		StaticSample.toUpper();
		System.out.println("대문자로 변경 : " + StaticSample.getValue());
		
		// 2번째 인덱스의 값을 j로 변경
		StaticSample.setChar(2, 'j');
		// 인덱스는 0부터 시작되므로 3번째값 변경
		System.out.println("3번째 값을 j로 변경 : " + StaticSample.getValue());
		
		System.out.println("문자열의 길이 : " + StaticSample.valueLength());
		System.out.println("PROGRAMMING 문자열 연결 : " + StaticSample.valueConcat("PROGRAMMING"));
	}

}

package com.kh.object;

//import java.util.*;

public class NSSApplication {

	public static void main(String[] args) {
		int[] numbers = {5,3,4,2,1};
		// 배열의 값을 정렬하고 싶어요
		// 방을 바꾸기위해 새로운 변수를 선언하고 이용함
		// 스트링의 인덱스도 0번부터 시작
		int lotteNum;
		for(int num : numbers){
			if (num == lotteNum) {
				
			}
		}
		
		Arrays.sort(numbers);
		System.out.println(numbers);
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String str = "abcde";
		
		System.out.println("char : " + (int)str.charAt(lotteNum));
		// 문자열 끊기
		System.out.println(str.length());
		System.out.println(str.substring(0,4)); // 0부터 2글자 끊기
		// 시작 인덱스, 끝 인덱스
		// 시작 인덱스는 포함, 끝 인덱스는 포함되지 않음
		System.out.println(str.substring(2,4));
		
	}

}

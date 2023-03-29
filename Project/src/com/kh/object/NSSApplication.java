package com.kh.object;

//import java.util.*;

public class NSSApplication {

	public static void main(String[] args) {
		nonStaticSample sample = new nonStaticSample();
		sample.printLottoNumbers();
		
		// char 하나의 글자를 입력합니다.
		// '' 홀따옴표 안에 입력
		// 하나의 글자를 꼭 입력해야합니다.
		sample.OutputChar(5, 'a');
		
		System.out.println();
		sample.alphabette();
		
		String str = "안녕하세요. 반갑습니다.";
		// 특정 문자열을 추출하는 방법
		// code123456 -> 상품코드 4자리 추출시 사용
		// System.out.println(str.substring(0, 6));
		// 원하는 위치의 문자열을 추출하여 반환해주므로
		// 원본은 수정되지 않는다.
		System.out.println(str.substring(0, 9));
		sample.mySubstring(str, 0, 2);
		System.out.println("원본 : " + str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int[] numbers = {5,3,4,2,1};
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
		System.out.println(str.substring(2,4));*/
		
	}

}

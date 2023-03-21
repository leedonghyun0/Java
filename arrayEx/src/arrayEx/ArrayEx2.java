package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열을 생성
		int[] score = {90 ,5 , 10};
		String[] names = {"홍길동", "오미선", "나자바"};
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		// 초기화; 조건식; 증감식
		// 변수명.length : 배열의 값의 갯수
		int sum = 0;
		for(int i=0; i <names.length; i++){
			System.out.println(names[i]);
			sum += score[i];
		}
		System.out.println("평균 : " + sum/names.length);

	}

}

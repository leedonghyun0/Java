package com.kh.object;

public class nonStaticSample {
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 출력
		// 중복을 제거

		// 0 <= random < 1
		// 0 <= random < 45 (*45)
		// 1 <= random < 46 (+1)
		// 1 ~ 45

		// 6개의 수를 저장할 공안을 생성
		int[] lotto = new int[6];

		// i : 0, 1, 2, 3, 4, 5
		for (int i = 0; i < lotto.length; i++) {
			// 새로운 임의의 수를 생성하여 배열에 저장
			lotto[i] = (int) (Math.random() * 45 + 1);

			// 중복체크
			// 동일한 숫자가 입력되었는지 체크
			// i=0,
			// j=0, 1, 2, 3, 4, 5
			for (int j = 0; j < i; j++) {
				// [0] == [0]
				if(lotto[i] == lotto[j]) {
					// -1
					i--;
				}
			}
		}
		
		// 방을 바꿀때 필요한 저장공간을 생성
		int temp = 0;
		// 순서대로 정렬하기
		for(int i=0; i<lotto.length; i++) {
			// 오름차순/내림차순
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]){
					// 방 바꾸기
					temp = lotto[i];
					// 작은 수가 앞으로 올 수 있도록 자리바꿈
					lotto[i] = lotto[j];
					// 큰 수를 뒤로 이동
					lotto[j] = temp;
				}
			}
		}

		// 반복문을 활용하여 배열을 출력
		System.out.print("Lotto Number\n");
		for (int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
		int num = (int) (Math.random() * 45 + 1);
	}

	public void OutputChar(int num, char c) {
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}

	}

	public char alphabette() {
		// 문자코드
		// A=65, z=122
		// a~z = 97~122
		// 91~96번까지 제외하는 처리
		// 임의의 수를 생성
		// 숫자를 추출해서 char 타입으로 변환
		// 65 ~ 122
		// 1 ~ 122
		// *n을 했을때 랜덤의 범위
		// 0 ~ n-1
		// 65 <= random < 122+1
		// 0 <= random < 1
		// *122+1
		// 1 ~ 122
		// 66~ 187
		// (int)(Math.random()*122+1);
		// (int)(Math.random()*122+65);  -> 초기값 65
		
		// 범위: 122+1-65
		int num = (int)(Math.random()*58 + 65);
		
		System.out.println((char)num);
		return (char)num;

	}

	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작 인덱스는 포함하고 끝 인덱스는 불포함
		return str.substring(index1, index2);
	}

}

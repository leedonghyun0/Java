package com.kh.object;

public class nonStaticSample {
	public void printLottoNumbers() {

		int i = 0;
		while (true) {
			int rotto = (int) (Math.random() * 45 + 1);
			System.out.println(rotto + " ");
			i++;
			if (i == 6) {
				break;
			}

		}
		// 오름차순 sort()
	}

	public void OutputChar(int num, char c) {
		System.out.println(" " + c + num + "개 : ");
		for(int i = 0; i<num; i++) {
			System.out.println(c);
		}

	}

	public char alphabette() {
		int num = 0;
		return 0;
		
	}

	public String mySubstring(String str, int index1, int index2) {
		String result = "";
		for(int i = index1; i < index2; i++) {
			result += str.charAt(i);
		}
		return result;
	}

}

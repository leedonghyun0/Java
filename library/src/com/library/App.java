package com.library;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이 : " + app.getInt());
		System.out.println("이름을 입력해주세요.");
		System.out.println("이름 : " + app.getString());
		
	}

	/**
	 * 사용자로부터 숫자 입력 받기.
	 * 
	 * @return
	 */
	public int getInt() {
		int i = 0;

		while (true) {
			try {
				String str = scan.next();

				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}

				i = Integer.parseInt(str);

				break;

			} catch (Exception e) {
				System.out.println("오류 발생");
			}
		}
		return i;
	}
	
	public String getString() {
		String str2 = "";
		
		while(true) {
			try {
				str2 = scan.next();
				
				// 숫자인 경우 다시 받아올 수 있도록 처리
				try {
					// 숫자로 변환 합니다.
					Integer.parseInt(str2);
					System.err.println("문자를 입력해주세요.");
					// 숫자로 변환 되면 입력을 다시 받아 올 수 있도록
					continue;
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				if(str2.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				break;
				
			} catch (Exception e) {
				System.out.println("오류 발생");
			}
		}
		return str2;
	}
}

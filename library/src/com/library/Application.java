package com.library;

import java.util.Scanner;

public class Application {
	// 인스턴스멤버 -> 생성 후 사용할수 있음
	// 레퍼런스 변수명으로 사용할 수 있음

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 인스턴스멤버는 생성 후 사용이 가능 합니다.
		// scan.next(); ===> 오류, ----> app.scan.next();
		Application app = new Application();

		/*
		 * System.out.println("나이를 입력해주세요"); System.out.println("나이 : " + app.getInt());
		 * System.out.println("이름을 입력해주세요"); System.out.println("이름 : " +
		 * app.getString());
		 */

		// 도서관 생성
		Library lib = new Library("file");

		while (true) {
			// 로그아웃 처리시 다시 실행
			// 로그인 처리
			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();

			if ("admin".equalsIgnoreCase(id)) {
				// 관리자 메뉴
				// app.adminMenu(lib);
				System.out.println("관리자 입니다.");
				app.adminMenu(lib);
			} else {
				app.memberMenu(lib);
			}
		}
	}

	private void memberMenu(Library lib) {
		// 사용자
		System.out.println("사용자 입니다.");
		// 메뉴별로 작업 수행
		while (true) {
			// 도서목록 출력
			lib.info();
			// 메뉴 확인
			System.out.println("1. 도서대여  2. 도서반납  (q,Q). 프로그램 종료");
			System.out.println("메뉴를 입력 해주세요.");
			int menu = getInt();

			if (menu == 1) {
				System.out.println("도서번호를 입력 해주세요.");
				int index = getInt();
				lib.rentBook(index);
			} else if (menu == 2) {
				System.out.println("도서번호를 입력 해주세요.");
				int index = getInt();
				lib.returnBook(index);
			} else {
				System.out.println("메뉴를 확인해주세요.");
			}
		}
	}

	private void adminMenu(Library lib) {
		outter: while (true) {
			// 관리자
			// 도서목록 출력
			lib.info();
			// 메뉴확인
			System.out.println("관리자 모드 입니다.");
			System.out.println("1. 도서등록  2. 도서삭제  0. 로그아웃  (q,Q).프로그램 종료");
			int menu = getInt();
			int no = 0;
			switch (menu) {
			case 1:
				System.out.println("일련번호를 입력 해주세요.");
				no = getInt();
				System.out.println("제목을 입력해주세요.");
				String title = getString();
				System.out.println("작가를 입력해주세요.");
				String author = getString();

				lib.insertBook(no, title, author, false);
				break;

			case 2:
				System.out.println("삭제할 책의 일련번호를 입력해주세요.");
				no = getInt();
				lib.deleteBook(no);
				break;

			case 0:
				break outter;

			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
			}
		}
	}

	/**
	 * 1: 숫자 2: 문자 3: 실수 리턴
	 * 
	 * @return
	 */

	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * 
	 * @return
	 */
	public int getInt() {
		int i = 0;

		while (true) {
			try {
				String str = scan.next();

				if (str.equalsIgnoreCase("q")) { // 대소문자 구분하지않고 q를 입력하면 종료
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}

				i = Integer.parseInt(str); // str을 int로 변환

				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}

	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * 
	 * @return
	 */
	public String getString() {
		String res = "";
		while (true) {
			try {
				res = scan.next();

				if (res.equalsIgnoreCase("q")) { // 대소문자 구분하지않고 q를 입력하면 종료
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}

				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생 했습니다.");
			}
		}
		return res;
	}

}

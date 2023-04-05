package com.library2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * //FileDao 테스트 FileDao dao = new FileDao(); List<Book> list = new
		 * ArrayList<>(); list.add(new Book(3, "오늘도", "우리는", false));
		 * dao.listToFile(list);
		 */

		// 라이브러리 생성
		Library lib = new Library();

		// app을 생성하지 않고 getString(), getInt() 메서드를 사용 할 수 없다.
		// main 메소드는 static메소드 정적메서드
		// 정적필드에서는 인스턴스 필드를 사용할수 없다
		// 생성하고 사용해야한다.
		App app = new App();
		// 로그인
		// id를 입력 받아서 admin이면 관리자 아니면 사용자
		// admin - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		Scanner scan = new Scanner(System.in);

		// 관리자 반복 시작
		while (true) {
			// 로그인 처리
			System.out.println("id : ");

			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해짐
			// 스캐너로 부터 입력을 받아서 리턴해주는 역할
			String id = getString();

			if (id.equalsIgnoreCase("admin")) {
				// 관리자 메뉴
				System.out.println("관리자 메뉴 입니다.");
				System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 종료");
				System.out.println("메뉴를 입력해주세요");
				int menu = getInt(); // 메뉴를 입력 받음
				int no = 0;
				switch (menu) {
				case 1:
					System.out.println("일련번호 : ");
					no = getInt(); // 일련번호
					System.out.println("도서명 : ");
					String title = getString(); // 도서명
					System.out.println("작가 : ");
					String author = getString(); // 작가

					lib.insertBook(no, title, author, false);
					break;
				case 2:
					System.out.println("삭제 할 책의 일련번호 : ");
					no = getInt();
					lib.deleteBook(no);

					break;
				case 0:
					System.out.println("로그아웃");
					return;

				default:
					System.err.println(menu + "없는 메뉴 입니다");
					break;
				}

			} else {
					// 사용자 메뉴
					System.out.println(id + "님 환영합니다.");
					int no = 0;
					// 사용자 메뉴 반복
					while (true) {
					System.out.println("1. 도서대여 2. 도서반환 0. 로그아웃 q. 종료");
					System.out.println("메뉴를 입력해주세요");
					int menu = getInt();

					switch (menu) {
					case 1:
						System.out.println("대여 할 도서 일련번호 : ");
						no = getInt();
						lib.rentBook(no);
						break;
					case 2:
						System.out.println("반납 할 도서 일련번호 : ");
						no = getInt();
						lib.returnBook(no);
						break;
					case 0:
						System.out.println("로그아웃");
						return;

					default:
						System.err.println(menu + "없는 메뉴 입니다");
						break;
					}
				}

			}
		}

		/*
		 * // 책 추가 lib.insertBook(1, "불편한 편의점", "나카사키", false); lib.insertBook(2,
		 * "불편한 편의점2", "나카사키", false);
		 * 
		 * //System.out.println(lib.toString()); System.out.println(lib);
		 * 
		 * // 책 삭제 // int no = 0; boolean res = lib.deleteBook(1);
		 * 
		 * res = lib.rentBook(2); res = lib.returnBook(2);
		 */

	}

	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * 
	 * @return
	 */
	public static String getString() {
		String res = "";
		while (true) {
			try {
				res = scan.next();

				// 숫자인 경우 다시 받아올수 있도록 처리.
				try {
					// 숫자로 변환 합니다.
					Integer.parseInt(res);
					System.err.println("문자를 입력해주세요.");
					// 숫자로 변환 되면 입력을 다시 받아 올수 있도록 합니다.
					continue;
				} catch (Exception e) {
					// TODO: handle exception
				}

				if (res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}

				break;
			} catch (Exception e) {
				System.err.println("입력중 오류가 발생 했습니다.");
				System.out.println("문자를 입력해주세요.");
			}

		}
		return res;
	}

	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * 
	 * @return
	 */
	public static int getInt() {
		int i = 0;
		String str = "";
		while (true) {
			try {
				// 사용자 입력받기
				str = scan.next();
				// Q인지 확인하기
				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);

				break;
			} catch (Exception e) {
				System.err.println("입력중 오류가 발생했습니다.");
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;

	}
}

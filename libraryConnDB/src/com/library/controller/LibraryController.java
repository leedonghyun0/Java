package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;

/**
 * 사용자의 요청을 입력 받습니다.
 * 요청에 맞는 서비스 로직을 호출 합니다.
 * @author user
 *
 */
public class LibraryController {
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();

	public void start() {
		System.out.println("=================");
		System.out.println("도서관에 오신걸 환영 합니다.");
		System.out.println("=================");

		while(true) {
			// 로그인 요청
			MemberVo memberVo = login();

			// 도서목록 출력
			bookService.getList();

			if ("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				// 관리자 계정
				adminMenu();
			} else {
				// 사용자 계정
				userMenu();
			}
		}
	}

	private void adminMenu() {
		outter:
		while (true) {
			System.out.println("관리자 메뉴==============");
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자 삭제 , 0. 이전메뉴 , q. 종료");

			System.out.println("메뉴를 입려해주세요");
			int menu = getInt();
			int bookNo = 0; // 일련번호
			String id = "";
			switch (menu) {
			case 1:
				// 도서 등록
				System.out.println("도서 일련번호를 입력해주세요.");
				bookNo = getInt();
				System.out.println("도서명을 입력해주세요.");
				String title = getString();
				System.out.println("작가를 입력해주세요.");
				String author = getString();

				int res = bookService.insertBook(new BookVo(bookNo, title, author, author));
				break;
			case 2:
				// 도서 삭제
				System.out.println("삭제할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				break;
			case 3:
				// 사용자 등록
				System.out.println("아이디를 입력해주세요.");
				id = getString();
				System.out.println("비밀번호를 입력해주세요.");
				String pw = getString();
				System.out.println("이름를 입력해주세요.");
				String name = getString();
				System.out.println("관리자계정은 Y를 입력해주세요.");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("y")?"Y":"N";
					
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				memberService.insertMember(memberVo);
				break;
			case 4:
				// 사용자 삭제
				System.out.println("삭제할 id를 입력 해주세요.");
				id = getString();
				
				memberService.deleteMember(id);
				break;
			case 0:

				break outter;

			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
				break;
			}
		}
	}

	private String getString() {
		String str = "";

		str = scan.next();
		if (str.equalsIgnoreCase("q")) {
			// q,Q가 입력되면 종료
			System.out.println("종료되었습니다.");
			System.exit(0);
		}

		return str;
	}
	
	

	private void userMenu() {

		System.out.println("사용자 메뉴===============");
		while(true) {
			System.out.println("1. 도서대여 2. 도서반납 0. 이전메뉴 q. 종료");
			int menu = getInt();
			int bookNo = 0;
			switch (menu) {
			case 1:
				System.out.println("대여할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.rentBook(bookNo);
				break;
				
			case 2:
				System.out.println("반납할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.returnBook(bookNo);
				break;
				
			case 0:
				
				return;
				
			default:
				System.out.println("메뉴를 확인 후 다시 선택 해주세요.");
				break;
			}
			
		}
		
		
	}

	/**
	 * 로그인 ID/PW를 입력 받아서 사용자 정보를 조회 해옵니다. 로그인 성공할때까지 반복
	 * 
	 * @return
	 */
	public MemberVo login() {
		while (true) {
			System.out.println("아이디를 입력 해주세요.");
			String id = getString();
			System.out.println("비밀번호를 입력 해주세요.");
			String pw = getString();

			MemberVo memberVo = memberService.login(id, pw);

			if (memberVo != null) {
				// 로그인 성공
				return memberVo;
			}
		}
	}

	public static Scanner scan = new Scanner(System.in);



	public static int getInt() {
		int i = 0;

		while (true) {
			try {
				String str = scan.next();
				if (str.equalsIgnoreCase("q")) {
					// q,Q가 입력되면 종료
					System.out.println("종료되었습니다.");
					System.exit(0);
				}

				i = Integer.parseInt(str);

				return i;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.err.println("숫자 입력 중 오류가 발생 했습니다.");
			}
		}
	}
	
	
}

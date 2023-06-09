package com.library2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {

	List<Book> list = null;
	// 인터페이스를 타입을 ㅗ선언 -> 인터페이스의 구현체를 선언
	Dao dao = new FileDao();

	// 생성자 : 클래스명과 같은 이름, 반환타입이 없다
	Library() {
		// 리스트 초기화
		list = dao.getList();

		System.out.println(toString());
	}

	@Override
	public String toString() {
		System.out.println("책 목록============= lib");
		String info = "";
		
		Collections.sort(list); // 정렬
		
		for (Book book : list) {
			info += book.toString() + "\n";
		}
		return info;
	}
	

	// 1. 책의 정보를 받아서 리스트에 책을 등록
	// 2. 리스트에 등록 후 파일로 출력합니다.
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		// 0. 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("일련번호가 중복되었습니다. \n확인 후 다시 입력해주세요.");
				return false;
			}
		}
		// 1. 책을 생성
		Book book = new Book(no, title, author, isRent);
		// 2. 리스트에 등록
		list.add(book);
		// 3. 리스트를 파일로 출력
		boolean res = dao.listToFile(list);
		// 4. 파일에 정상적으로 등록이 되지 않은 경우
		// 리스트에서 제거
		if (!res) {
			list.remove(book);
			System.out.println("책이 등록되지 않았습니다.\n 관리자에게 문의 해주세요");
			return false;
		}
		System.out.println("책이 등록 되었습니다.");
		System.out.println(toString());
		return true;
	}

	/**
	 * 책의 일련번호를 입력 받아서 리스트에서 삭제 리스트를 파일로 출력합니다.
	 * 
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		for (Book book : list) {
			if (no == book.getNo()) {
				// 삭제
				list.remove(book);
				// 리스트를 파일로 출력
				boolean res = dao.listToFile(list);
				if (!res) {
					// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다.
					list.add(book);
					System.err.println("파일 출력도중 오류가 발행 하였습니다.\n Library.deleteBook()");
					return false;
				}
				System.out.println("정상적으로 삭제 되었습니다.");
				return true;
			}
		}
		System.out.println("일치하는 일련번호가 없습니다. 일련번호를 확인해주세요.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 상태가 렌트가 가능한 상태(isRent = false) 라면 렌트
	 * 렌트가 가능한 상태가 아니라면 메세지 처리
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(!book.isRent()) {
					// 렌트 상태로 변경
					book.setRent(true);
					// 파일로 출력
					boolean res = dao.listToFile(list);
					// 데이터베이스 업데이트
					
					if(!res) {
						book.setRent(false);
						System.out.println("파일을 출력하는데 실패했습니다.");
					}
					System.out.println("도서가 대여처리 되었습니다.");
					System.out.println(toString());
				}
				return true;
			}
		}
		System.out.println("일치하는 일련번호가 없습니다.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 도서를 찾는다
	 * 도서가 대여중이라면 반납처리
	 * 아니면 (반납가능한 도서가 아닙니다) 메세지 처리
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					// 반납 처리
					book.setRent(false);
					dao.listToFile(list);
					// DB 업데이트 로직 호출
					// dao.update(no);
					System.out.println("반납 되었습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("반납 가능한 도서가 아닙니다.");
				}
			}
			
		}
		System.err.println("일치하는 일련번호가 없습니다.\n 일련번호를 확인해주세요.");
		return false;
	}

}

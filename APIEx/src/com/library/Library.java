package com.library;

import com.objectEx.ObjectEx;

public class Library {
	
	
	// LibMain의 System.out.println(lib.toString())을 출력
	@Override
	public String toString() {
		String str = "";
		for(Book b : bookArry) {
			str += b.getTitle() + " " + b.getAuthor() + "\n";
			// str += b.toString() + "\n"; // 다시 또 재정의
		}
		return str;
	}
// ==========================================================================	
/*
		// 책을 생성
		Book book = new Book("혼공자", "신용권");
		Book book2 = new Book("자바의 정석", "...");
		
		// 도서관의 책 배열에 추가
		lib.addBook(0, book);
		lib.addBook(1, book2);
		lib.addBook(2, book);
		lib.addBook(3, book2);
		lib.addBook(4, book);
*/
		
	private Book[] bookArry = new Book[5];
	
/*
	public void addBook(int index, Book book) {
		bookArry[index] = book;
	}
*/
	
	public void addBook() {
		bookArry[0] = new Book("혼자 공부하는 자바", "신용권");
		bookArry[1] = new Book("자바의 정석", "신용식");
		bookArry[2] = new Book("Do!it! java", "김기량");
		bookArry[3] = new Book("불편한 편의점", "홍경민");
		bookArry[4] = new Book("너무 열심히 산 것 같다", "잘했다");
	}
	
}

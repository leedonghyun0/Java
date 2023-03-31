package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library_bk {
	// -> 책을 담고있는 리스트
	List<Book> bookList = new ArrayList<>(); // 인터페이스는 객체 생성 x
	
	public Library_bk() {
		
	}

	public Library_bk(List<Book> bookList) {
		this.bookList = bookList;
	}
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
	}
	@Override
	public String toString() {
		String res = "";
		for(Book book : bookList) {
			System.out.println(res = book.getTitle() + "/" + book.getAuthor() + "/" + book.isRent() + "\n");
			res = book.getTitle() + "/" + book.getAuthor() + "/" + book.isRent() + "\n";
		}
		return super.toString();
	}
}

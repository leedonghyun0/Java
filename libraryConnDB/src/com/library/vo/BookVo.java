package com.library.vo;

public class BookVo {
	int bookNo;
	String title;
	String author;
	String rentYn;
	
	public BookVo(int bookNo, String title, String author, String rentYn) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.rentYn = rentYn;
	}
	
	@Override
	public String toString() {
		String str = getRentYn().equals("Y")? "대여중":"";
		return getBookNo() + " " + getTitle() + " " + getAuthor() + " " + str;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRentYn() {
		return rentYn;
	}

	public void setRentYn(String rentYn) {
		this.rentYn = rentYn;
	}
	
	
}

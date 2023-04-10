package com.library.controller;

public class MemberVo {
	String id;
	String pw;
	String name;
	String adminYN; // 관리자 계정인지 아닌지 판단, Y : 관리자 계정
	
	public MemberVo(String id, String pw, String name, String adminYN) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.adminYN = adminYN;
	}
	
	@Override
	public String toString() {
		return getId() + " " + getName() + " " + getAdminYN();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/* public String getPw() { // 비밀번호는 get -> X
		return pw;
	}*/

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}
	
	
}

package com;

public class Member {
	
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member.toString());
		System.out.println(member); // toString() 호출 결과를 출력
		
	}
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
		// = return getId() + ":" + getName();
	}

	
}

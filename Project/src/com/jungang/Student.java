package com.jungang;

public class Student extends Person {
	private int grade; // 학년
	private String major; // 전공
	
	public Student(){
		
	}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// 부모의 생성자를 호출
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return "이름 "  + super.name + super.information() + this.grade + "학년 " + "전공 " + this.major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	

}

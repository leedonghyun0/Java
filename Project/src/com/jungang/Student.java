package com.jungang;

public class Student extends Person {
	private int grade; // 학년
	private String major; // 전공
	
	public Student(){
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return null;
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

package com.jungang;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// 객체 배열 할당
		Student[] stud = new Student[3];
		// 3명의 학생 정보
		stud[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stud[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stud[2] = new Student("강개순", 20, 167.0, 45.0, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		for(Student student : stud) {
			System.out.println(student.information());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] employee = new Employee[10];
		
		Scanner scan = new Scanner(System.in);
		
		// 사원 1명 추가될때마다 카운트
		int count = 0;
		
		while(true) {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("나이 : ");
			int age = scan.nextInt();
			System.out.println("신장 : ");
			double height = scan.nextDouble();
			System.out.println("몸무게 : ");
			double weight = scan.nextDouble();
			System.out.println("급여 : ");
			int salary = scan.nextInt();
			System.out.println("부서 : ");
			String dept = scan.next();
			
			employee[count] = new Employee(name, age ,height, weight, salary, dept);
			count += 1;
			
			System.out.println("객체 추가 : (y)/(Y),  종료 : (n)");
			String s = scan.next();
			if(s.equals("y")) {
				continue;
			} else if(s.equals("Y")) {
				continue;
			} else if(s.equals("n")) {
				System.out.println("=============프로그램 종료================");
				break;
			}
		}
		// 현재까지 기록된 사원들의 정보 출력
		for(int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
		}

	}

}

package com.animal;

public class Application {

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] ani = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성(매개변수 생성자로 생성)
		ani[0] = new Dog("이름1", "강아지1", 10); // 이름, 종류, 몸무게
		ani[1] = new Dog("이름2", "강아지2", 8);
		ani[2] = new Cat("이름3", "고양이1", "집", "검정"); // 이름, 종류, 서식, 색상
		ani[3] = new Cat("이름4", "고양이2", "길", "하얀색");
		ani[4] = new Dog("이름5", "강아지3", 5);
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의 객체의 speak() 메소드 호출
		for(Animal animal : ani) {
			animal.speak();
		}
		
		
	}

}

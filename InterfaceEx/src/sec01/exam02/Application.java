package sec01.exam02;

import sec01.exam01.Audio;

public class Application {

	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성 후
		// 참조타입 변수에 저장
		MyClass myclass = new MyClass();		
		// MyClass의 필드에 접근
		myclass.rc.turnON();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		System.out.println();
		
		// 1_2. 필드에 새로운 객체를 생성하여 저장
		myclass.rc = new Audio();
		myclass.rc.turnON();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		System.out.println("***************************");
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass myclass1 = new MyClass(new Audio());
		myclass.rc.turnON();
		myclass.rc.setVolume(5);
		myclass.rc.turnOff();

		System.out.println("***************************");
		
		// 3. 인터페이스가 메서드의 매개변수로 이용된 경우
		// 기본 생성자로 생성하면 rc = new SmartTV(); 로 생성 됩니다.
		// 필드의 선언부에서 생성하고 있습니다.
		MyClass myclass2 = new MyClass();
		
		// 인터페이스가 메서드의 매개변수 타입으로 사용될경우
		// 메서도 호출시 구현 객체를 매개값으로 대입합니다.
		myclass2.methodB(new Audio());
		myclass2.rc.turnON();
		myclass2.rc.setVolume(15);;
		myclass2.rc.turnOff();
		
		System.out.println("***************************");
		
		MyClass myclass3 = new MyClass();
		// 4. 메서드에 선언된 로컬변수를 rc에 저장
		myclass3.methodA();
		myclass3.rc.turnON();
		myclass3.rc.setVolume(7);;
		myclass3.rc.turnOff();
	}

}
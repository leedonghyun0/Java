package sec01.exam01;

public class Application {

	public static void main(String[] args) {

		// 인터페이스는 생성할 수 없지만
		// 참조변수의 타입으로 사용할 수 있다.
		// 인터페이스(RemoteControl) 변수(rc) = new 구현객체(Audio);
		System.out.println("MAX_VOLUME = " + RemoteControl.MAX_VOLUME + " MIN_VOLUME = " + RemoteControl.MIN_VOLUME + "\n");
		
		// 인터페이스 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다
		RemoteControl rc = new Audio();
		// Audio audio = new Audio();
		rc.turnON();
		rc.setVolume(15);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl tv = new Television();
		
		tv.turnON();
		tv.setVolume(-1);
		tv.turnOff();
		
		System.out.println();
		
		RemoteControl smartTV = new SmartTV();
		smartTV.turnON();
		smartTV.setVolume(-1);
		smartTV.turnOff();
		
		Searchable searchable = new SmartTV();
		Television television = new SmartTV();
		searchable.search("asdfsf");

	}

}

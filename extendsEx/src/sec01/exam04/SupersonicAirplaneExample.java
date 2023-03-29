package sec01.exam04;

public class SupersonicAirplaneExample {
/*
	public SupersonicAirplaneExample() {

	}
*/
	public static void main(String[] args) {
		SupersonicAirplane superSonic = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		// 이륙합니다.
		superSonic.takeOff();
		superSonic.fly();
		
		// ★★ 가독성을 높여주기 위해 상수를 사용
		superSonic.flyMode = SupersonicAirplane.SUPERSONIC;
		superSonic.fly();
		
		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();
		
		// 착륙
		superSonic.land();
	}

}

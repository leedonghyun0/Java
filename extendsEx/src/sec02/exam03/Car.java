package sec02.exam03;

public class Car {
	// 초기값 : null
	// 필드의 다형성
	private Tire tireFR;
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;

	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		// 생성자
		// 타이어 필드를 초기화
//		tireFR = new Tire("FR 앞쪽 오른쪽바퀴 ", 3);
//		tireFL = new Tire("FL 앞쪽 왼쪽바퀴 ", 5);
//		tireBR = new Tire("BR 뒤쪽 오른쪽바퀴 ", 1);
//		tireBL = new Tire("BL 뒤쪽 왼쪽바퀴 ", 10);
		tireFR = tire1;
		tireFL = tire2;
		tireBR = tire3;
		tireBL = tire4;
	}
	/**
	 * 바퀴를 굴려줍니다
	 * @return
	 */
	public int run() {
		System.out.println("굴러갑니다!");
		boolean next = tireFR.roll();
		if(!next) { // false 이면
			// 바퀴가 터지면 return 1
			System.out.println(tireFR.location + " 교체 ========= \n");
			// 다형성에 의해 자식 객체는 부모의 타입으로 자동 형변환 된다.
			tireFR = new KumhoTire(tireFR.location, 3);
			return 1;
		}
		
		if(!tireFL.roll()) { // 바퀴가 펑크가 났다면
			// return2
			System.out.println(tireFL.location + " 교체 ========= \n");
			tireFL = new KumhoTire(tireFL.location, 3);
			return 2;
		}

		if(!tireBR.roll()) {
			// return3
			System.out.println(tireBR.location + " 교체 ========= \n");
			tireBR = new KumhoTire(tireBR.location, 3);
			return 3;
		}
		
		if(!tireBL.roll()) {
			// return4
			System.out.println(tireBL.location + " 교체 ========= \n ");
			tireBL = new KumhoTire(tireBL.location, 3);
			return 4;
		}
		
		
		return 0;
	}
	
	/**
	 * 바퀴의 위치를 매개변수로 받아서
	 * 해당 위치의 바퀴를 교체하는 메서드
	 * @param location
	 */
	public void changeTire(int location) {
		switch (location) {
		
		case 1:
			tireFR = new KumhoTire(tireFR.location, 3);
			break;

		case 2:
			tireFL = new KumhoTire(tireFL.location, 3);
			break;

		case 3:
			tireBR = new KumhoTire(tireBR.location, 3);
			break;

		case 4:
			tireBL = new KumhoTire(tireBL.location, 3);
			break;

		default:
			break;
		}
	}
}

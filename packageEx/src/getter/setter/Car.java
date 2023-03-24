package getter.setter;

public class Car {
	private int speed; // 직접접근을 제한해놔서 Main클래스에서 car.speed 사용불가
	private boolean stop;

	public int getSpeed() { // 필드값을 반환
		return speed;
	}

	public void setSpeed(int speed) { // 필드의 값을 변경, 검증 후 값을 변경합니다.
		if (speed > 0) {
			this.speed = speed;
		} else {
			this.speed = 0;
			// System.out.println("값을 변경 할 수 없습니다.");
		}
	}

	// is로 시작하면 반환 타입이 boolean인 경우가 많음
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		if(stop) {
			this.setSpeed(0);
			// System.out.println("스탑");
		}
		this.stop = stop;
	}

}

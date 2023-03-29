package sec02.exam03;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 호출되지 않습니다.
		super(location, maxRotation + 2);
	}

	@Override
	public boolean roll() {
		rotation++; // 타이어 1회전
		System.out.println("********금호타이어" + location + "누적 회전수 : " + rotation); // 어디의 회전수인지
		System.out.println("********금호타이어" + location + "최대 회전수 : " + maxRotation);
		System.out.println();

		if (rotation >= maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		}
		return true; // 아니면 계속 굴러감

	}

}

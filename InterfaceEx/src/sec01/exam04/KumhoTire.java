package sec01.exam04;

// 인터페이스의 구현체는 인터페이스를 타입을 사용할 수 있다.
public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");

	}

}

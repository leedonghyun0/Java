package sec01.exam04;

// 상속받을때 사용하는 키워드
// extends + 부모 클래스명

public class SupersonicAirplane extends Airplane{
	
	// 상수는 대문자로 작성
	// 한번 정의후 값을 변경할 수 없다
	// 대문자로 작성하고 단어를 연결할 경우 _를 붙여준다
	// 비행모드를 숫자타입으로 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 비행상태
	public int flyMode;
	
	// 매개변수를 받아서 flyMode를 세팅
	public SupersonicAirplane(int flyMode){
		// 부모 생성자 호출
		System.out.println("===== SuperSonicAirplane 생성합니다.");
		if(flyMode == NORMAL || flyMode == SUPERSONIC) { // 1이거나 2가 아니라면
			this.flyMode = flyMode;			
		} else {
			flyMode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행 입니다.");
		} else {
			// fly()를 재정의 했지만
			// 부모가 가지고 있는 fly() 메서드를 호출할 수 있음
			// super를 이용해서 접근
			super.fly();
		}
		
	}
	
	public void booster() {
		System.out.println("부스터 작동!!!");
	}

}

package sec03.exam01;

// 추상메서드를 하나라도 포함하고 있으면 추상 클래스가 된다.
// 추상메서드가 없어도 abstract를 선언해서 추상클래스가 될 수 있다
// 객체를 생성 불가, 추상 클래스 생성 불가능
public abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드
	// 코드블럭이 완성되어 있지 않음
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 하위클래스에게 작성을 강제한다
	// 미완성된 메서드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOff();
}

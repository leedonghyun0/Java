package car.common;

public class Car {

	// 필드 생성
	String model;
	String color;
	int maxSpeed;

	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언

	// 생성자의 특징 2가지
	public Car() { // 기본 생성자
		// this. => 필드
		// this() => 생성자
		// 생성자를 사용하기 위해서 알맞은 파라메터를 넣어줌

		// 1. 생성자에서 다른 생성자를 호출 할 수 있다
		// -> 중복되는 코드를 줄이기 위해서
		this("기본모델", "블랙", 150);
	}

	public Car(String model) { // 생성자 오버로딩
		// model = model; -> 코드블럭 안에서는 로컬변수가 우선되므로 아무런 의미가 없음
		// this.model = model;
		// this(model,"",150);
		this(model, null, 0); // -> 중복 코드를 줄이기 위해서
	}

	// 생성자 오버로딩
	public Car(String model, String color) {
		// 생성자를 호출 하는것은 첫번째 줄에서만 가능
		this(model, color, 150); // 첫줄에만 가능
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

}

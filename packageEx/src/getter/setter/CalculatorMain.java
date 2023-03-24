package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		// static을 사용해서 생성자를 생성안하고 사용이 가능.
		// 정적 필드, 정적 메서드는 생성하지 않고 클래스 이름으로 접근하여 사용한다.
		double res = 10*10*Calculator.pi;
		int plus = Calculator.plus(5, 5);
		int minus = Calculator.minus(5, 3);
		System.out.println(res);
		System.out.println(plus);
		System.out.println(minus);
	}

}

package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn(); // 계산기 실행
		int res = calc.add(5, 5);
		System.out.println(res);
		
		// 오류 =======
		// 매개변수의 타입과 갯수가 일치하지 않을 때
		// 이름이 다를경우
		
		
		// 배열을 생성 후 메서드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers) : " + calc.add(numbers));
		
		// 메서드를 실행할 때 배열을 생성
		calc.add(new int[] {1,2,3});
		System.out.println("calc.add(new int[] {1,2,3}) : " + calc.add(new int[] {1,2,3}));
		
		System.out.println("calc.addFn : " + calc.addFn(1,2,3,4,5,6,7));

	}

}

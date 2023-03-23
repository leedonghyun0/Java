package exam06;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double rectangle = calc.areaRectangle(5); // 직사각형 넓이
		System.out.println("정사각형 넓이 : " + rectangle);
		double rectangle2 = calc.areaRectangle(10, 20); // 정사각형 넓이
		System.out.println("직사각형 넓이 : " + rectangle2);
		
		System.out.println("직사각형의 넓이 : " + calc.areaRectangle(5, 15));

	}

}

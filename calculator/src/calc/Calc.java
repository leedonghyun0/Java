package calc;

// 위에서 아래로 작성
public class Calc {
	public static void main(String[] args) {
		System.out.println("객체 생성");
		
		Calc calc = new Calc();
		calc.execute(); // void 메서드 호출
		
		
	}
	
	public void execute() {
		System.out.println("execute() 함수 시작");
		double result = avg(7,10);
		System.out.println("실행 결과 : " + result);
	}

	private double avg(int i, int j) { // private : 클래스 내부에서만 접근가능, 외부에서는 x
		System.out.println("avg 시작");
		int sum = plus(i,j); // sum = 더하기 함수 호출
		System.out.println("avg 실행");
		return sum/2.0; // 2, 2.0(실수)
	}

	private int plus(int i, int j) { // 더하기 함수
		System.out.println("plus 시작");
		System.out.println("plus 실행");
		return i + j;
	}

}

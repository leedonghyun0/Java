package calc;

public class Calculator {
	
	// true : 켜짐, false = 꺼짐
	boolean powerOn; // 초기값 : false
	
	/**
	 *  전원을 키거나 끕니다
	 */
	public void powerOn() {
		if(powerOn == true) {
			powerOn = false;
			System.out.println("계산기를 종료 합니다.");
		} else if (powerOn == false){
			powerOn = true;
			System.out.println("계산기를 실행 합니다.");
		}
	}
	
	public int add(int num1, int num2) {
		if(powerOn == true) {
			return num1 + num2;
		} else {
			System.out.println("계산기를 실행 해주세요.");
			return 0;
		}
	}
	
	// 타입이 달라서 add 변수 사용가능 -> 오버로딩
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	// 배열로 들어온다
	// int 타입이 여러개 입력 => 배열로 받아서 사용
	public int addFn(int ... numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}

}

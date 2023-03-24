package package1;

import package2.C;

public class A {
	// 필드 정의
	// C c = new C();
	// 코드 작성 불가
	
	// 기능 정의 (안에 코드 작성)
	public void method1() {
		C c = new C(1); // 필드없이 작성해도됨
		c.method1();
		// c.method2(); // 오류 -> 외부에서 접근 불가 (private)
	}

}


class B {
	// default일 경우 같은 패키지에서 호출 가능
	// public B() { 
	B(){ // public 생략 -> default 접근 제한
		
	}
}
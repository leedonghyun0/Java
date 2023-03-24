package package2;

import package1.A;

// import java.util.Calendar;

public class C {
	
	// 생성자
	/*
	public C(){    // => 기본 생성자
		
	}
	*/
	
	// 외부(class A)에서 생성자 접근 제한
	private C() {
		// Calendar cal = Calendar.getInstance();
		// B b = new B(); // -> default 다른 패키지에서 접근 불가
	}
	
	public C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
	}
	
	private void method2() {
		System.out.println("method2");
	}

}

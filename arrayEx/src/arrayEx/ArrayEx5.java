package arrayEx;

// 접근제어자 class 클래스명 {}
public class ArrayEx5 {
	/* 접근제어자(public static) 반환타입(void) 메서드명(매개변수){} : 메서드 작성 방법
	   void : 반환 타입이 없다는 의미
	   매개변수 작성 : (타입 변수명)
	   매개변수 : 있을수도 있고 없을수도 있다
	   매개변수가 있다면 타입을 명시 해줘야 한다. */
	public static void main(String[] args) {
		System.out.println(args.length);
		
		// Run Configurations => Arguments -> program arguments
		// 1: 로컬, 2: 테스트, 3: 운영
		int mode = Integer.parseInt(args[0]);
		if(mode==1) {
			System.out.println("로컬 환경 입니다.");
			// 로컬 DB 접속
			
		} else if(mode==2) {
			System.out.println("테스트 환경 입니다.");
			// 테스트 DB에 접속
			
		} else if(mode==3){
			System.out.println("운영 환경 입니다.");
		}
			// 운영 DB 접속
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
			
		}
		
		//System.out.println(args[0]);
	}

}

package member.service;

import java.util.Scanner;

public class MemberService3Main {

	public static void main(String[] args) {
		MemberService3 service = new MemberService3("홍길동", "1234"); // 생성자 실행 -> 매개변수와 동일한 타입, 동일한 개수

		Scanner scan = new Scanner(System.in);

		while (true) { // 로그인이 성공할때까지 반복
			// 사용자로부터 id/pw를 입력 받는다
			System.out.println("id : ");
			String id = scan.next();
			System.out.println("pw : ");
			String pw = scan.next();
			// boolean res = service.login("홍길동", "1234");
			boolean res = service.login(id, pw);

			if (res) {
				System.out.println("환영합니다.");
				System.exit(0);
			} else {
				System.out.println("id/pw가 일치하지 않습니다.");
			}
		}
	
		System.out.println("로그아웃을 하시려면 q를 입력해주세요.");
		
		String exit = scan.next();
		if("q".equals(exit)) {
			System.exit(0);
		}
	}

}

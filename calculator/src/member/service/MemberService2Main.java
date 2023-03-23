package member.service;

import java.util.Scanner;

public class MemberService2Main {

	public static void main(String[] args) {
		MemberService2 memberService2 = new MemberService2("홍길동", "12345");

		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (true) {
			System.out.println("아이디를 입력해주세요 : ");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요 : ");
			String pw = scan.next();

			boolean res = memberService2.Login(id, pw);
			if (res) {
				System.out.println(memberService2.id + "님 로그인 되었습니다.");
			} else {
				System.out.println("id, password 오류");
				i++;
				if(i>=5) {
					System.out.println("시스템을 종료합니다.(비번 불일치 5회 초과)");
					System.exit(0);
				}
			}
		}
	}

}

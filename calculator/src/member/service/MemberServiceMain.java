package member.service;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		// boolean res = memberService.Login("홍길동", "12345");
		// if(res) { }
		if (memberService.Login("hong", "12345")) {
			System.out.println("로그인 되었습니다.");
			memberService.Logout("홍길동");
		} else {
			System.out.println("id, password 오류");
		}

	}

}

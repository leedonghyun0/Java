package member.service;

public class MemberService3 {
	// 필드
	public String id;
	public String pw;
	
	// 생성자
	public MemberService3(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// 메서드
	// 필드에 등록 된 id, pw가 일치해야지 로그인이 가능(true)
	// 일치하지 않으면 false를 반환
	/**
	 * 로그인 처리
	 * @param id
	 * @param pw
	 * @return 로그인 성공 : true, 로그인 실패 : false
	 */
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		if(id != null 						// id가 null이 아니고
				&& id.equals(this.id)   	// id가 필드의 id값과 동일하고
				&& pw != null 				// pw가 null이 아니고
				&& pw.equals(this.pw)) {	// pw가 필드의 pw값과 동일하면-
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패 : id, pw 오류");
			return false;
		}
	}
	
	public void logout() { // ★★ 괄호안에 (String id)=지역변수를 안썼으므로 this.id가 아니라 id(필드 값)을 의미
		System.out.println(id + "님 로그아웃 되었습니다.");
	}

}

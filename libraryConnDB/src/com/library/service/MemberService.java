package com.library.service;

import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	
	
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회 합니다.
	 * @param id
	 * @param pw
	 * @return
	 */
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo != null) {
			System.out.println(memberVo.getName() + "님 환영합니다.");
			return memberVo;
		} else {
			System.out.println("아이디/비밀번호가 일치하지 않거나 없는 계정 입니다.");
			return null;
		}
	
	}
	
	/**
	 * 사용자 등록
	 * @param memberVo
	 */
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("입력 되었습니다.");
		} else {
			System.out.println("입력 중 오류가 발생 했습니다.");
		}
	}

	public void deleteMember(String id) {
		// 사용자 조회
		// 사용자를 조회 할 수 없습니다. 메세지 출력
		int res = memberDao.deleteMember(id);
		if(res>0) {
			System.out.println("입력 되었습니다.");
		} else {
			System.out.println("입력 중 오류가 발생 했습니다.");
		}
	}
}

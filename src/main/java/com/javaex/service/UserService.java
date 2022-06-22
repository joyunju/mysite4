package com.javaex.service;

import com.javaex.vo.UserVo;

public class UserService {

	// 필드

	// 생성자

	// 메소드 - gs

	// 메소드 일반
	public void join(UserVo userVo) {
		System.out.println("UserService > join()");

		// 회원가입 비즈니스 로직
		System.out.println(userVo);
	}

}

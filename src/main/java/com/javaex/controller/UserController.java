package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
public class UserController {

	// 필드
	@Autowired
	// UserService userService = new UserService();
	UserService userService;

	// 생성자

	// 메소드 - gs

	// 메소드 일반

	// 회원가입폼: joinForm
	@RequestMapping(value = "/user/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("UserController > joinForm()");

		// 기본 뷰 리졸버 하기 전
		// return "/WEB-INF/views/user/joinForm.jsp";
		return "user/joinForm";
	}

	// 회원가입: join
	@RequestMapping(value = "/user/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController > join()");

		//System.out.println(userVo);

		// UserService userService = new UserService();
		int count = userService.join(userVo);
		System.out.println("UserController: " + count);

		// 기본 뷰 리졸버 하기 전
		// return "/WEB-INF/views/user/join.jsp";
		return "user/joinOk";
	}

}

package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	// 필드

	// 생성자

	// 메소드 - gs

	// 메소드 일반

	// 
	@RequestMapping(value = "/user/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("UserController > joinForm()");

		return "user/joinForm";
	}

}

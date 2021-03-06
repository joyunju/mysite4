package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value="/user")
public class UserController {

	// 필드
	@Autowired
	// UserService userService = new UserService();
	UserService userService;
	// 생성자

	// 메소드 - gs

	// 메소드 일반
	
	// 로그인 : login 
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController > login()");
		
		UserVo authUser = userService.login(userVo);
		//System.out.println("UserController : " + authUser);
		//System.out.println(userVo);
		//session.setAttribute("authUser", authUser);
		
		/* 세션에 저장 */

		if(authUser != null) { 
			System.out.println("로그인 성공");
			session.setAttribute("authUser", authUser);
			return "redirect:/main";
			
		}else {  
			System.out.println("로그인 실패");
			return "redirect:/user/loginForm?result=fail";
		}
		
		//return "redirect:/main";
		

	}
	
	// 로그인 : loginForm
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm() {
		System.out.println("UserController > loginForm()");
		
		return "user/loginForm";
	}
	

	// 회원가입폼: joinForm
	@RequestMapping(value = "/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("UserController > joinForm()");

		// 기본 뷰 리졸버 하기 전
		// return "/WEB-INF/views/user/joinForm.jsp";
		return "user/joinForm";
	}

	// 회원가입: join
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController > join()");

		//System.out.println(userVo);

		// UserService userService = new UserService();
		int count = userService.join(userVo);
		System.out.println("UserController: " + count);

		// 기본 뷰 리졸버 하기 전
		// return "/WEB-INF/views/user/joinOk.jsp";
		return "user/joinOk";
	}

}



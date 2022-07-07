package com.javaex.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApiGuestbookController {
	
	// 필드

		// 생성자

		// 메소드 - gs

		// 메소드 일반

		// 메인
		// http://localhost:8088/mysite/api/guestbook/addList
		@RequestMapping(value = "/api/guestbook/addList", method = { RequestMethod.GET, RequestMethod.POST })
		public String addList() {
			System.out.println("ApiGuestbookController > addList");
			
			
			// 기본 뷰 리졸버 하기 전
			// return "/WEB-INF/views/apiGuestbook/addList.jsp";
			return "apiGuestbook/addList";
		}

}

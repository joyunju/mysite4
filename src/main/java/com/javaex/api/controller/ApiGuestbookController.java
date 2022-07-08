package com.javaex.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GuestbookService;

@Controller
public class ApiGuestbookController {

	// 필드
	@Autowired
	private GuestbookService guestbookService;

	// 생성자

	// 메소드 - gs

	// 메소드 일반

	// 메인
	// http://localhost:8088/mysite/api/guestbook/addList
	@RequestMapping(value = "/api/guestbook/addList", method = { RequestMethod.GET, RequestMethod.POST })
	public String addList() {
		System.out.println("ApiGuestbookController > addList()");

		// 기본 뷰 리졸버 하기 전
		// return "/WEB-INF/views/apiGuestbook/addList.jsp";
		return "apiGuestbook/addList";
	}

	// 방명록 리스트 데이터만 보내줘
	@RequestMapping(value = "/api/guestbook/list", method = { RequestMethod.GET, RequestMethod.POST })
		public String list() {
		System.out.println("ApiGuestbookController > list()");
			
		return "";
	}

}

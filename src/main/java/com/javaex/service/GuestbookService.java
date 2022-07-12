package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestBookDao guestbookDao;
	
	// 전체리스트 가져오기
	public List<GuestbookVo> getGuestList(){
		System.out.println("GuestbookService > getGuestList()");
		
		guestbookDao.selectList();
		
		return null;
	}

}

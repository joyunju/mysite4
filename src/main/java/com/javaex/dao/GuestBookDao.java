package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestBookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 전체 리스트 가져오기
	public List<GuestbookVo> selectList(){
		System.out.println("GuestBookDao > selectList()");
		
		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.selctList");
		System.out.println("guestbookList");
		
		return null;
	}

}

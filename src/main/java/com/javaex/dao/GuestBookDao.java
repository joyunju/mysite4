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
	
	public List<GuestbookVo> selectList(){
		System.out.println("GuestBookDao > selectList()");
		
		sqlSession.selectList("guestbook.selctList");
		
		return null;
	}

}

package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BoardVo;

@Repository
public class BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 리스트(일반)
	public List<BoardVo> selectList4() {
		System.out.println("BoardDao > selectList()");

		List<BoardVo> boardList = sqlSession.selectList("board.selectList4");
		//System.out.println(boardList);
		return boardList;
	}
	
	
	

	// 리스트(일반 + 검색)
	public List<BoardVo> selectList3(String keyword) {
		System.out.println("BoardDao > selectList3()");
		
		List<BoardVo> boardList = sqlSession.selectList("board.selectList3", keyword);
		
		return boardList;
	}
	
	
	
	// 글전체 가져오기(리스트만 출력할때)
	public List<BoardVo> selectList() {
		System.out.println("BoardDao > selectList()");

		List<BoardVo> boardList = sqlSession.selectList("board.selectList");
		
		return boardList;
	}

	// list > 검색 : value = "/search"
	public List<BoardVo> selectList2(String keyword){
		System.out.println("BoardDao > selectList2()");
		System.out.println(keyword);
		
		List<BoardVo> boardList = sqlSession.selectList("board.selectList2", keyword);
		//System.out.println(boardList);
		return boardList;
		//return null;
	}
	
	
	
	
	
	
}
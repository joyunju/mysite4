package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	// 리스트(일반 + 페이징 + 검색)
		public List<BoardVo> getBoardList4() {
			System.out.println("BoardService > getBoardList4()");

			List<BoardVo> boardList = boardDao.selectList4();	
			
			return boardList;
		}
	
	

	//리스트(일반 + 검색)
	public List<BoardVo> getBoardList3(String keyword) {
		System.out.println("BoardService > getBoardList3()");

		List<BoardVo> boardList = boardDao.selectList3(keyword);	
		
		return boardList;
	}
	
	
	// 리스트(리스트만 출력할때)
	public List<BoardVo> getBoardList() {
		System.out.println("BoardService > getBoardList()");

		List<BoardVo> boardList = boardDao.selectList();	
		
		return boardList;
	}
	
	// list > 검색 : value = "/search"
	public List<BoardVo> getBoardList2(String keyword){
		System.out.println("BoardService > getBoardList2()");
		
		List<BoardVo> boardList = boardDao.selectList2(keyword);
		
		return boardList;
	}
	
	
	
}
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBoardMapper;
import com.example.demo.paging.PageVO;
import com.example.demo.search.SearchVO;
import com.example.demo.vo.BoardVO;

@Service
public class BoardService implements IBoardService{

	@Autowired
	IBoardMapper mapper;
	
	

	@Override
	public BoardVO getArticle(int boardNum) {
		
		mapper.updateViewCnt(boardNum);
		return mapper.getArticle(boardNum);
	}

	@Override
	public void insert(BoardVO article) {
		mapper.insert(article);
		
	}

	@Override
	public void update(BoardVO article) {
		mapper.update(article);
		
	}

	@Override
	public void delete(int boardNum) {
		mapper.delete(boardNum);
		
	}

	@Override
	public int countArticles(SearchVO vo) {
		return mapper.countArticles(vo);
	}

	@Override
	public List<BoardVO> getAllArticles(SearchVO vo) {
		
		return mapper.getAllArticles(vo);
	}

	

	
	

	
}

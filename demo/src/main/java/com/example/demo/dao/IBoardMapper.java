package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.paging.PageVO;
import com.example.demo.search.SearchVO;
import com.example.demo.vo.BoardVO;

@Mapper
public interface IBoardMapper {

	//전체 리스트 조회(검색과 페이징 포함)
	List<BoardVO> getAllArticles(SearchVO vo);
	
	//특정 게시물 조회
	BoardVO getArticle(int boardNum);
	
	//게시물 조회수 상승
	void updateViewCnt(int boardNum);
	   
	//전체 게시물수 조회(검색 페이징 포함)
	int countArticles(SearchVO vo);
	
	//게시물 등록
	void insert(BoardVO article);
	
	//특정게시물 수정
	void update(BoardVO article);
	
	//특정게시물 삭제
	void delete(int boardNum);
	
	
}

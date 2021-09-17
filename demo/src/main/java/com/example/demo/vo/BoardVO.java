package com.example.demo.vo;

import java.util.Date;

public class BoardVO {

	private int boardNum;
	private String writer;
	private String title;
	private String content;
	private Date wrDate;
	private int viewCnt;
	
	public int getboardNum() {
		return boardNum;
	}
	
	public void setboardNum(int board_num) {
		this.boardNum = board_num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWrDate() {
		return wrDate;
	}
	public void setWrDate(Date wrDate) {
		this.wrDate = wrDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}

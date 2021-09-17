package com.example.demo.search;

import com.example.demo.paging.PageVO;

public class SearchVO extends PageVO{
	
	private String keyword;
	private String condition;
	
	public SearchVO() {
		this.keyword = "";
		this.condition= "";
	}
	
	@Override
	public String toString() {
		return "SearchVO [keyword=" + keyword + ", condition=" + condition + "]";
	}

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}

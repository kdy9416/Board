package com.example.demo.paging;

public class PageCreator {

	private PageVO paging;
	private int beginPage;
	private int endPage;
	private int totalArticles;
	private boolean prev;
	private boolean next;
	
	private final int displayPage = 4;
	
	public void calc() {
		endPage =  (int)Math.ceil(paging.getPage() / (double)displayPage) * displayPage;
		beginPage = endPage - displayPage + 1;
		prev = (beginPage == 1) ? false : true;
		next = (totalArticles > endPage * paging.getCountPerPage()) ? true : false;
		if(!next) {
			endPage = (int)Math.ceil((double)totalArticles / paging.getCountPerPage());
		}
	}
	
	public PageVO getPaging() {
		return paging;
	}

	public void setPaging(PageVO paging) {
		this.paging = paging;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotalArticles() {
		return totalArticles;
	}

	public void setTotalArticles(int totalArticles) {
		this.totalArticles = totalArticles;
		calc();
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPage() {
		return displayPage;
	}
	
	
	
	
}

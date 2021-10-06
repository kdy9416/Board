<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>게시글 목록</h2>

<table border="1">
	<tr>
		<td>번호</td>
		<td>작성자</td>
		<td>제목</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	
	<c:forEach var="v" items="${all}">
	<tr>
		<td>${v.boardNum}</td>
		<td>${v.writer}</td>
		<td><a href="/demo/check?boardNum=${v.boardNum}">${v.title}</a></td>
		<td>
		${v.wrDate}
		</td>
		<td>${v.viewCnt}</td>
	</tr>
	</c:forEach>	
	
</table>
	                 
		
		<c:if test="${pc.prev}">
		<a class="page-link" href="/demo/list?page=${pc.paging.page - 1}&countePerPage=${pc.paging.countPerPage}" 
			style="background-color: #ff52a0; margin-top: 0; heght: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">이전</a>
		</c:if>				
					
		
		<c:forEach var="pageNum" begin="${pc.beginPage}" end="${pc.endPage}">
		<a href="/demo/list?page=${pageNum}&countePerPage=${pc.paging.countPerPage}&keyword=${pc.paging.keyword}&condition=${pc.paging.condition}" class="page-link" style="margin-top: 0; height: 40px; color: pink; border: 1px solid pink;">${pageNum}</a>
		</c:forEach>
						
		<c:if test="${pc.next}">
		<a class="page-link" href="/demo/list?page=${pc.paging.page + 1}&countePerPage=${pc.paging.countPerPage}" 
		style="background-color: #ff52a0; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">다음</a>
		</c:if>
				 

<p>
	<a href="/demo/write">게시글 작성하기</a>
</p>
<p>
	<a href="/demo/list?page=1&countPerPage=5">5</a>
	<a href="/demo/list?page=1&countPerPage=10">10</a>
	<a href="/demo/list?page=1&countPerPage=15">15</a>
</p>

						<form action="/demo/list"> 
	                       <select id="condition" class="form-control" name="condition">                            	
	                            <option value="title">제목</option>
	                            <option value="content">내용</option>
	                            <option value="writer">작성자</option>
	                            <option value="titleContent">제목+내용</option>
	                        </select>
	                   
		                    <div class="form-group col-sm-4">
		                        <div class="input-group">
		                            <input type="text" class="form-control" name="keyword" id="keywordInput" placeholder="검색어">
		                            <span class="input-group-btn">
		                                <input type="submit" value="검색" class="btn btn-izone btn-flat" id="searchBtn">                                       
		                            </span>
		                        </div>
		                    </div>
	                  	</form>

</body>
</html>



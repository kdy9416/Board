<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${vo.boardNum}번 게시물 내용</h2>
	
	<p>
		# 글번호: ${vo.boardNum} <br>
		# 작성자: ${vo.writer}<br>
		# 제목: ${vo.title}<br>
		# 내용: <textarea rows="3" disabled>${vo.content}</textarea>	
	</p>
	
	<a href="/demo/list">글 목록보기</a>&nbsp;
	<a href="/demo/modify?boardNum=${vo.boardNum}">글 수정하기</a>&nbsp;
	<a href="/demo/delete?boardNum=${vo.boardNum}">글 삭제하기</a>
</body>
</html>
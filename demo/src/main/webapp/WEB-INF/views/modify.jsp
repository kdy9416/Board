<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${vo.boardNum}번 게시물 내용 수정</h2>
	<form method="post" action="/demo/modify">
	
	<p>
		# 글번호:${vo.boardNum} <br>
		<input type="hidden" name="boardNum" value="${vo.boardNum}">
		# 작성자:<input type="text" name="writer" value="${vo.writer}"><br>
		# 제목: <input type="text" name="title" value="${vo.title}"><br>
		# 내용: <textarea rows="3" name="content" >${vo.content}</textarea>	
		<br>
		<input type="submit" value="수정">
	</p>
	</form>

<a href="/demo/list">글 목록보기</a> &nbsp;
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="hidden" name="pno" value="${productVO.pno }">
	pno : ${productVO.pno }<br>
	
	title : ${productVO.title }<br>
	mentor : ${productVO.mentor }<br>
	category : ${productVO.category }<br>
	intro : ${productVO.intro }<br>
	
	<hr>
	
	contentsImg  <br>
	<c:forEach var="item" items="${contentImgList }">
		<c:out value="${item }"/><br>
	</c:forEach>
	
	<hr>
	
	contentsText  <br>
	<c:forEach var="item" items="${contentTextList }">
		<c:out value="${item }"/><br>
	</c:forEach>
	
	<hr>
	
	qnaQList  <br>
	<c:forEach var="item" items="${qnaQList }">
		<c:out value="${item }"/><br>
	</c:forEach>
	
	<hr>
	
	qnaAList  <br>
	<c:forEach var="item" items="${qnaAList }">
		<c:out value="${item }"/><br>
	</c:forEach>
	
	
	<button type="button" value="수강하기" onclick="location.href='enrollProduct?pno=${productVO.pno}'"></button>
	
	
	
	
	
</body>
</html>
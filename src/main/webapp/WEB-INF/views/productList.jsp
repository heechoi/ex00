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
	<c:forEach var="item" items="${list }">
		<p>
			상품 이름 :${item.name }<br>
			상품 가격 :${item.price }<br>
		</p>
	</c:forEach>
	
</body>
</html>
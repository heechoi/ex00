<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label{
		float: left;
		width:150px;
	}
</style>
</head>
<body>
	<fieldset>
		<legend>비만도 테스트 결과</legend>
		<p>
			<label>이름 : </label>
			${myinfo.name }
		</p>
		<p>
			<label>키 : </label>
			${myinfo.height }
		</p>
		<p>
			<label>몸무게 : </label>
			${myinfo.weight }
		</p>
		<c:forEach var="item" items="${myinfo.hobbys }" >
			<p>
				<label>취미 : </label>
				${item }
			</p>
		</c:forEach>
		<p>
			<label>비만도 : </label>
			${result }
		</p>
	</fieldset>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
		<form action="bmi2" method="post">
		<p>
			<label>이름 : </label>
			<input type="text" name="name">
		</p>
		<p>
			<label>키 : </label>
			<input type="text" name="height">
		</p>
		<p>
			<label>몸무게 : </label>
			<input type="text" name="weight">
		</p>
		<p>
			<label>취미1: </label>
			<input type="text" name="hobbys">
		</p>
		<p>
			<label>취미2 : </label>
			<input type="text" name="hobbys">
		</p>
		<p>
			<label>취미3 : </label>
			<input type="text" name="hobbys">
		</p>
		<p>
			<input type="submit" value="계산">
		</p>
		</form>
	
	</fieldset>
</body>
</html>
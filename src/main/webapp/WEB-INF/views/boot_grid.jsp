<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	#row1 div{
	 border:1px solid red;
	 padding:10px;
	}
	
	#row2 div{
		margin-top: 100px;
		border:1px solid red;
		background: pink;
		padding:10px;
	}
	
	#row3 div{
	margin-top: 100px;
	border:1px solid red;
	padding:10px;
	background: blue;
	}
	
	#row4 div{
		margin: 100px;
		border:1px solid black;
		padding:10px;
		background-color: red;
	}
	
		#row5 div{
	margin-top: 100px;
	border:1px solid red;
	padding:10px;
	background: yellow;
	}
</style>

</head>


<body>
	<div class="row" id="row1">
		<div class="col-sm-1">.col-sm-1</div>
		<div class="col-sm-1">.col-sm-2</div>
		<div class="col-sm-1">.col-sm-3</div>
		<div class="col-sm-1">.col-sm-4</div>
		<div class="col-sm-1">.col-sm-5</div>
		<div class="col-sm-1">.col-sm-6</div>
		<div class="col-sm-1">.col-sm-7</div>
		<div class="col-sm-1">.col-sm-8</div>
		<div class="col-sm-1">.col-sm-9</div>
		<div class="col-sm-1">.col-sm-10</div>
		<div class="col-sm-1">.col-sm-11</div>
		<div class="col-sm-1">.col-sm-12</div>
	</div>
	
	<div class="row" id="row2">
		<div class="col-sm-4">.col-sm-4</div>
		<div class="col-sm-8">.col-sm-8</div>
	</div>
	
	<div class="row" id="row3">
		<div class="col-sm-6">.col-sm-6</div>
		<div class="col-sm-6">.col-sm-6</div>
	</div>
	
	<div class="row" id="row4">
		<div class="col-sm-4 col-sm-offset-4">.col-sm-4</div>
	</div>
	
	<div class="row" id="row5">
		<div class="col-xs-6 col-sm-3">Column1</div>
		<div class="col-xs-6 col-sm-3">Column2</div>
		<div class="col-xs-6 col-sm-3">Column3</div>
		<div class="col-xs-6 col-sm-3">Column4</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 등록</title>
</head>
<body>
<h1>할일 등록</h1>
	<form action="add" method="post" accept-charset="UTF-8">
		<label>어떤일인가요?<br><input type="text" placeholder="swift 공부하기(24자까지)" name="title"></label><br>
		<label>누가 할일인가요?<br><input type="text" placeholder="홍길동" name="name"></label><br>
		우선순위를 선택하세요<br>
			<input type="radio" name="sequence" value=1>1순위
			<input type="radio" name="sequence" value=2>2순위
			<input type="radio" name="sequence" value=3>3순위<br>
		<input type="reset" value="내용지우기">
		<input type="submit" value="제출">
	</form>
	<button type="button" onclick="location.href='/todo/todo'">< 이전</button>
	
</body>
</html>
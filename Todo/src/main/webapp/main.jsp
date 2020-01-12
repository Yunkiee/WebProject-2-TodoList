<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 해야할 일들</title>
</head>
<script>
function ajax(data1,data2) {
	
	var oReq = new XMLHttpRequest();
	
	oReq.onload = function() {                       // When response has loaded
		  // The following conditional check will not work locally - only on a server
		  if(oReq.status === 200) {                       // If server status was ok
			  document.getElementById("new").innerHTML = this.responseText;
			  
		  }
			
		};
	console.log(data1);
	console.log(data2);
	oReq.open("GET", "/todo/type", true);//parameter를 붙여서 보낼수있음. 
	oReq.setRequestHeader('id', data1);
	oReq.setRequestHeader('type', data2);
	oReq.send();


}
</script>
<body>

<div id=new>
<h1>나의 해야할 일들</h1>
	<table border="1">
		<tr>
			<td>TODO</td>
			<td>DOING</td>
			<td>DONE</td>
		</tr>
		<tr id=todo-list>
			<td>
				<c:forEach items="${l1 }" var="list">
				<li>${list.title }<br>
				등록날짜: ${list.regdate }, ${list.name }, 우선순위 ${list.sequence }
				<button onclick="ajax((${list.id }),'TODO');"> -> </button>
				</li></c:forEach>
			</td>
			<td>
				<c:forEach items="${l2 }" var="list">
				<li>${list.title }<br>
				등록날짜: ${list.regdate }, ${list.name }, 우선순위 ${list.sequence }
				<button onclick="ajax((${list.id }),'DOING');">-></button>
				</li></c:forEach>
			</td>
			<td>
				<c:forEach items="${l3 }" var="list">
				<li>${list.title }<br>
				등록날짜: ${list.regdate }, ${list.name }, 우선순위 ${list.sequence }
				</li></c:forEach>
			</td>
		</tr>
		
		
	</table>
	
	<a href="/todo/todoform">새로운 TODO 등록</a>	
</div>
</body>

</html>
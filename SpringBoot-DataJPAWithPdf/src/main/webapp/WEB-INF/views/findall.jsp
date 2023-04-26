
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#students {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#students td, #students th {
	border: 1px solid #ddd;
	padding: 8px;
}

#students tr:nth-child(even) {
	background-color: #f2f2f2;
}

#students tr:hover {
	background-color: #ddd;
}

#students th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<a href="./sa">Employee student </a>
	<table id="students">
		<tr>
			<th>emp ID</th>
			<th>emp NAME</th>
			<th>emp scl</th>

			<th>Actions</th>
		</tr>
		<c:forEach items="${ms}" var="stu">
			<tr>
				<td>${stu.id}</td>
				<td>${stu.name}</td>
				<td>${stu.scl}</td>



				<td><a href="./delete?id=${stu.id}">delete</a> <a
					href="./up?id=${stu.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#employees {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#students td, #employees th {
	border: 1px solid #ddd;
	padding: 8px;
}

#employees tr:nth-child(even) {
	background-color: #f2f2f2;
}

#employees tr:hover {
	background-color: #ddd;
}

#employees th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<a href="./go">Employee student </a>
	<table id="employees">
		<tr>
			<th>emp ID</th>
			<th>emp NAME</th>
			<th>emp DOJ</th>

			<th>Actions</th>
		</tr>
		<c:forEach items="${ss}" var="dt">
			<tr>
				<td>${dt.id}</td>
				<td>${dt.ename}</td>
				<td>${dt.doj}</td>



				<td><a href="./delete?id=${dt.id}">delete</a> <a
					href="./up?id=${dt.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>





</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="${us.id}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="${us.name}"></td>
			</tr>
			<tr>
				<td>sal</td>
				<td><input type="text" name="scl" value="${us.scl}"></td>
			</tr>
				<tr>
				<td><input type="submit" value="update"></td>


			</tr>



		</table>
		</form>


</body>
</html>
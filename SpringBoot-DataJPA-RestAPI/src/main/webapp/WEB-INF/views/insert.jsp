<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./insert" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>doj</td>
				<td><input type="date" name="doj"></td>
			</tr>
			
				<tr>
				<td><input type="submit" value="save"></td>


			</tr>



		</table>


	</form>

</body>
</html>
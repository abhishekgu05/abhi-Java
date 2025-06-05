<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1 style="text-align: center; color: red;">Registration Form 2.O</h1>
		<form action="/RegistrationForm/RegisterForm" method="post">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" id="firstname" name="firstname" required="required"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<!-- <tr>
				<td>Contact :</td>
				<td><input type="number" name="contact"></td>
			</tr>-->
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>
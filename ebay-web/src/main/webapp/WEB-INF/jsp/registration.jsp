<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" modelAttribute="registrationUser" action="registration1.do">
		<table>
			<thead>Fill below details for registration</thead>
			<tr>
				<td>
					<label>Enter First Name : </label>
				</td>
				<td>
					<form:input path="fname"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter Last Name : </label>
				</td>
				<td>
					<form:input path="lname"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter Email : </label>
				</td>
				<td>
					<form:input path="email"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter Password : </label>
				</td>
				<td>
					<form:input path="password"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter Mobile No.</label>
				</td>
				<td>
					<form:input path="mobno"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Register"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
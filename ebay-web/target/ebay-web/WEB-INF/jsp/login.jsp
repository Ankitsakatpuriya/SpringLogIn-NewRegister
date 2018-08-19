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
	<form:form modelAttribute="keyUser" method="post" action="login1.do">
		<table>
			<tr>
				<td colspan="2">
					Enter Login Credential
				</td>
			</tr>
			<tr>
				<td>
					<label>Email : </label>
				</td>
				<td>
					<form:input path="email" id="email"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Password : </label>
				</td>
				<td>
					<form:password path="password"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit"/>
				</td>
			</tr>
		</table>
	</form:form>
	<a href="registrationPage.do">New User Registration</a></br>
	<a href="productPage.do">Product</a>
</body>
</html>
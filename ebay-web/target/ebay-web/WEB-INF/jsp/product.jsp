<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<table>
					<form:form modelAttribute="addProduct" method="post" action="product1.do">
						<tr>
							<td colspan="2">
								Enter product details :
							</td>
						</tr>
						<tr>
							<td>
								<label>Product Name : </label>
							</td>
							<td>
								<form:input path="pname"/>
							</td>
						</tr>
						<tr>
							<td>
								<label>Product Price : </label>
							</td>
							<td>
								<form:input path="pprice"/>
							</td>
						</tr>
						<tr>
							<td>
								<label>Product Description : </label>
							</td>
							<td>
								<form:input path="pdesc"/>
							</td>
						</tr>
						<tr>
							<td>
								<label>Date : </label>
							</td>
							<td>
								<form:input path="date"/>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" value="Submit">
							</td>
						</tr>
					</form:form>
				</table>
			</td>
		</tr>
		<tr>
			<td>
    			<table border="1">
	    			<c:if test="${not empty prodList}">	
	    				<tr>
	    					<td>pid</td>
	    					<td>pname</td>
	    					<td>pprice</td>
	    					<td>pdesc</td>
	    					<td>date</td>
	    				</tr>
	    			</c:if>	    
	  				<c:forEach items="${prodList}" var="p">
	        			<tr>
	        				<td><c:out value="${p.pid}" /></td>
	          				<td><c:out value="${p.pname}" /></td>
	          				<td><c:out value="${p.pprice}" /></td>
	          				<td><c:out value="${p.pdesc}" /></td>
	          				<td><c:out value="${p.date}" /></td>
	        			</tr>
	      			</c:forEach>
    			</table>
    		</td>
		</tr>
	</table>				
</body>
</html>
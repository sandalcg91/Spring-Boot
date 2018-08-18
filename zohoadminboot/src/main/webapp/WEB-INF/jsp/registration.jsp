<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form action="userSignUp" method="post" modelAttribute="userReg">
		<table class="tab" border="2" cellpadding="2" cellspacing="2" align="center" height="100%">
			<tr>
				<td>FirstName</td>
				<td><form:input path="firstname"/></td>
				<%-- <td><form:errors path="firstname" class="error"/></td> --%>
			</tr>
			<tr>
				<td>LastName</td>
				<td><form:input path="lastname"/></td>
<%-- 				<td><form:errors path="lastname" class="error"/></td> --%>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email"/></td>
<%-- 				<td><form:errors path="email" class="error"/></td> --%>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password"/></td>
<%-- 				<td><form:errors path="password" class="error"/></td> --%>
			</tr>
			<tr>
				<td>Mobile No.</td>
				<td><form:input path="mobileno"/></td>
<%-- 				<td><form:errors path="mobileno" class="error"/></td> --%>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
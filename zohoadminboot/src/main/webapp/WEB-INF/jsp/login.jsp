<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<h1>Welcome ! Login page</h1>
  <form:form method="post" action="userSignIn" modelAttribute="userMap">
  <pre>				    
  						<%-- <form:errors path="email"/> --%>
  Enter Email		: <form:input path="email"/>
  					 <%-- <form:errors path="password"/> --%>
  Enter Password	: <form:password path="password"/>
  					  <input type="submit" value="Submit"/>
  					  <!-- <a href="userRegistration.do">Click Here For Registration!!</a>
  					  <a href="product.do">Click Here For product</a> -->
  </pre>
  </form:form>
</body>
</html>
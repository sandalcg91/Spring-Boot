<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form:form action="productEdit" method="post" modelAttribute="prod">
		<pre>
				<form:hidden path="prodid"/>
 				Product name      : <form:input path="prodname" />
 				Product Desc      : <form:input path="proddesc" />
 				Product Price     : <form:input path="prodprice" />
				Product Quantity  : <form:input path="prodqty" />
							 <input type="submit" value="Update">
		</pre>
	</form:form>
</body>
</html>
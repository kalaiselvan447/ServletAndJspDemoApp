<%@page import="com.user.web.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		/* UserInfo user = (UserInfo) request.getAttribute("userInfo"); */
		
		UserInfo user = (UserInfo) session.getAttribute("userInfo");
	
		out.println(user);
		
	%>

</body>
</html>
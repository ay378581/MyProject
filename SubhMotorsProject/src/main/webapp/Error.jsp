<%@ page language="java" 
	contentType="text/html; 
	charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s = "Session Expired .. Please Login Again..";
request.setAttribute("msg", s);
%>

<jsp:forward page="custlogin.jsp"/>
</body>
</html>
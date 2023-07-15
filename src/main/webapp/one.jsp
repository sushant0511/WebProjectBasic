<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String m1=request.getParameter("n1");
String m2=request.getParameter("n2");
int a=Integer.parseInt(m1);
int b=Integer.parseInt(m2);
out.println(a+b);

%>
</body>
</html>
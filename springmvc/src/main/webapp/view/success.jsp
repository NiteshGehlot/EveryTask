<%@ page  import="java.util.* , com.starhealth.springmvc.entity.*"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>WELCOME TO SUCCESS JSP PAGE</h1>

<%


	List<Employee>  list = (List)	session.getAttribute("empList");
	
	out.print(list);
	
	

%>







</body>
</html>
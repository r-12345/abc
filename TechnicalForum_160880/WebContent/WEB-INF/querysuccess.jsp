<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Technical Forum</title>
</head>
<body>


<h1> Gear Technical Forum </h1>
<br>
<h2>Answer The Query</h2>




<table>

<a:forEach var = "queries" items = "${data}">
    <tr>
				<td>Query Id :</td>
				<td><form:input path="query_id" /></td>
				
                <td> ${queries.query_id} </td>
	</tr>
    <tr>
				<td>Select Technology :</td>
				<td><form:input path="technology" /></td>
				 <td> ${queries.technology} </td>
				
	</tr>	
	
	<tr>
				<td>Question :</td>
				<td><form:input path="query" /></td>
				 <td> ${queries.query} </td>
	</tr>
	<tr>
				<td>Question Raised By :</td>
				<td><form:input path="querypersonName" /></td>
				 <td> ${queries.querypersonName} </td>
	</tr>
	<tr>
				<td>Solution :</td>
				<td><form:input path="solution" /></td>
				 <td> ${queries.solution} </td>
	</tr>
	
	
	<tr>
				<td>Answered by :</td>
				<td><form:input path="solutionproviderName" /></td>
				 <td> ${queries.solutionproviderName} Please select</td>
	</tr>
	
	


</a:forEach>
</table>




</body>
</html>
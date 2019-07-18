<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/logout">Logout</a>


<table>
<tr>

<td>
<form action="create">
<table>
<caption>
Create New Employee
</caption>
<tr>
<td><input type="text" name="ename" placeholder="employee name"></td>
<td><input type="text" name="edesign" placeholder="employee designation"></td>
<td><input type="submit" value="create"></td>
</tr>
</table>
</form>
</td>

<td>
<form action="update">
<table>
<caption>
Update Employee
</caption>
<tr>
<td><input type="text" name="eid" placeholder="employee id" value="${eid}" readonly="readonly"></td>
<td><input type="text" name="ename" placeholder="employee name" value="${ename}"></td>
<td><input type="text" name="edesign" placeholder="employee designation" value="${edesign}"></td>
<td><input type="submit" value="Save"></td>
</tr>
</table>
</form>
</td>

</tr>
</table>



<br/>
<table>
<thead>
<tr>
<th>Employee ID</th>
<th>Employee Name</th>
<th>Employee Designation</th>
<th>Actions</th>
</tr>
</thead>

<c:forEach var="s" items="${list}">
<tbody>
<tr>
<td>${s.eid}</td>
<td>${s.ename}</td>
<td>${s.edesign}</td>
<td>
<form action="getemp">
<input type="hidden" name="eid" value="${s.eid}">
<input type="submit" value="edit">
</form>
</td>

<td>
<form action="delete">
<input type="hidden" name="eid" value="${s.eid}">
<input type="submit" value="delete">
</form>
</td>

</tr>
</tbody>

</c:forEach>

</table>

</body>
</html>
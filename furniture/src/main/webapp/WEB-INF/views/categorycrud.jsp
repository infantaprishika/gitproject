<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
	<center>
		<h1>Category Information</h1>
	</center>

	<form:form action="addCategory" method="POST">
		<table align="center">
			<tr>
				<td><form:label path="categoryId">CATEGORY ID: </form:label></td>
				<td><form:input path="categoryId" id="categoryId" value="${category.categoryId} " /></td>
			</tr>
			<tr>
				<td><form:label path="categoryName">CATEGORY NAME:</form:label></td>
				<td><form:input path="categoryName" id="categoryName"  value="${category.categoryName}"/></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><input type="submit" value="Add Category" /></td>
			</tr>


		</table>

	</form:form>

<br />

	<c:if test="${!empty categorylist}">
		<center>
			<table align="center" border="2">
				<tr>
					<th>CATEGORY ID</th>
					<th>CATEGORY NAME</th>
					 <th>Action </th>
				</tr>

				<c:forEach items="${categorylist}" var="category">
					<tr>
						<td><c:out value="${category.categoryId}" /></td>
						<td><c:out value="${category.categoryName}" /></td>
						<td>
						<a href="editCategory?id=${category.categoryId}">Edit</a> | <a href="deleteCategory?id=${category.categoryId}">Delete</a>
						</td>
			 			</tr>
				</c:forEach>
			</table>
		</center>
	</c:if>


</body>
</html>
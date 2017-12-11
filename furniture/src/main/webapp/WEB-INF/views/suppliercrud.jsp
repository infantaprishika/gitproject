<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
<style>
body {
	background-color: white;
}
</style>
</head>
<body>
	<br>
	<center>
		<h1>Supplier Information</h1>
	</center>

	<form:form action="addSupplier" method="POST">
		<table align="center">
			<tr>
				<td><form:label path="supplierId">SUPPLER ID: </form:label></td>
				<td><form:input path="supplierId" id="supplierId" value="${supplier.supplierId}" /></td>
			</tr>
			<tr>
				<td><form:label path="supplierName">SUPPLIER NAME:</form:label></td>
				<td><form:input path="supplierName" id="supplierName"  value="${supplier.supplierName}"/></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><input type="submit" value="Add Supplier" /></td>
			</tr>


		</table>

	</form:form>


	<br />
	<br />
	<br />
	<br />

	<c:if test="${!empty supplierlist}">
		<center>
			<table align="center" border="2">
				<tr>
					<th>Supplier ID</th>
					<th>SupplierName</th>
					<th>Update</th>
				</tr>

				<c:forEach items="${supplierlist}" var="supplier">
					<tr>
						<td><c:out value="${supplier.supplierId}" /></td>
						<td><c:out value="${supplier.supplierName}" /></td>
						<td><a href="editSupplier?id=${supplier.supplierId}">Edit</a> | <a href="deleteSupplier?id=${supplier.supplierId}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</center>
	</c:if>

</body>
</html>



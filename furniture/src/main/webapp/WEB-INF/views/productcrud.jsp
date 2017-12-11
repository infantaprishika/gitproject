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
		<h1>Product Information</h1>
	</center>

	<form:form action="addProduct" method="POST"  enctype="multipart/form-data" >
		<table align="center">
			<tr>
				<td><form:label path="productId">PRODUCT ID: </form:label></td>
				<td><form:input path="productId" id="productId"
						value="${product.productId} " /></td>
			</tr>
			<tr>
				<td><form:label path="productName">PRODUCT NAME:</form:label></td>
				<td><form:input path="productName" id="productName"
						value="${product.productName}" /></td>
			</tr>
			<tr>
				<td><form:label path="productDescription">PRODUCT DESCRIPTION:</form:label></td>
				<td><form:input path="productDescription"
						id="productDescription" value="${product.productDescription}" />
					<br /></td>
			</tr>
			<tr>
				<td><form:label path="productPrice">PRODUCT PRICE:</form:label></td>
				<td><form:input path="productPrice" id="productPrice"
						value="${product.productPrice}" /></td>
			</tr>


			<tr>
				<td><form:label path="supplier">
						<spring:message text="Supplier" />SELECT SUPPLIER
					</form:label></td>

				<td><form:select path="supplier.supplierName"
						items="${supplierList}" itemValue="supplierName"
						itemLabel="supplierName" style="color:black;" /></td>
			</tr>
			<tr>
				<td><form:label path="category">
						<spring:message text="Category" />SELECT CATEGORY
					</form:label></td>

				<td><form:select path="category.categoryName"
						items="${categoryList}" itemValue="categoryName"
						itemLabel="categoryName" style="color:black;" /></td>
			</tr>


			<tr>
				<td><form:label path="image">
						<spring:message text="Image" />SELECT IMAGE
					</form:label></td>
				<td><form:input type="file" name="image" path="image"
						style="color:black;" /></td>

			</tr>
			
			
			<tr>
				<td></td>
				<td align="left"><input type="submit" value="Add Product" /></td>
			</tr>





		</table>

	</form:form>

	<br />
	<c:if test="${!empty productList}">
		<center>
			<table align="center" border="2">
				<tr>
					<th>PRODUCT ID</th>
					<th>PRODUCT NAME</th>
					<th>PRODUCT DESCRIPTION</th>
					<th>PRODUCT PRICE</th>
					<th>Action</th>
				</tr>

				<c:forEach items="${productlist}" var="product">
					<tr>
						<td><c:out value="${product.productId}" /></td>
						<td><c:out value="${product.productName}" /></td>
						<td><c:out value="${product.productDescription}" /></td>
						<td><c:out value="${product.productPrice}" /></td>

						<td><a href="editProduct?id=${product.productId}">Edit</a> |
							<a href="deleteProduct?id=${product.productId}">Delete</a></td>
					</tr>
				</c:forEach>
				<c:forEach items="${product}" var="product">
					<select>
						<option value="categorylist">Category</option>
						<option value="supplierlist">Supplier</option>
					</select>
				</c:forEach>
			</table>
		</center>
	</c:if>


</body>
</html>
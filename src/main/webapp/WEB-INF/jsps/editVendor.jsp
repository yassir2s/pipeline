<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>

<form action="showEditVendor" method="post">
<pre>
Id: 	<input type="text" name="id" value="${vendor.id }" readonly="readonly"/>
Code:	<input type="text" name="code" value="${vendor.code }" />
Name:	<input type="text" name="name" value="${vendor.name }" />
Type:	<select name="type">
		<option value="REGULAR"    ${vendor.type=='REGULAR'?'selected':''} >Regular</option>
		<option value="CONTRACTED" ${vendor.type=='CONTRACTED'?'selected':''} >Contracted</option>
		</select>
Email:	<input type="text" name="email" value="${vendor.email }" />
Phone:	<input type="text" name="phone" value="${vendor.phone }" />
Address:<textarea rows="4" cols="50" name="address" >${vendor.address }</textarea>
<input type="submit" value="edit"/>
</pre>
</form>
</body>
</html>
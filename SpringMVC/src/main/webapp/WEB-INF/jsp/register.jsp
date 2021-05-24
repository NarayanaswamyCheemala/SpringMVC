<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form:form method="post" action="save"> 
<table align="center">
<tr >
<td ><label> User Name : </label>
</td>
<td><input name="username" maxlength="5"> </input> </td>

</tr>

<tr >
<td ><label> Password : </label>
</td>
<td><input name="password" maxlength="5"> </input> </td>
</tr>

<tr >
<td ><label> FirstName : </label>
</td>
<td><input name="firstname" maxlength="5"> </input> </td>
</tr>

<tr >
<td ><label> Last Name : </label>
</td>
<td><input name="lastname" maxlength="5"> </input> </td>
</tr>
<tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  

</table>
</form:form>

<p> $(msg)</p>
</body>
</html>
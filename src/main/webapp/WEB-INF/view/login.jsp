<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Sample Application</title>
</head>
<body>
	<h1>LoginPage</h1>
	<form name='loginForm'
		action="<c:url value='j_spring_security_check' />" method='POST'>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		</table>

		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

	</form>
</body>
</html>
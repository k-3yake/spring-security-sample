<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Sample Application</title>
  </head>
  <body>
	<h1>Hello, ${name}!</h1>
	<form:form modelAttribute="loginForm" action="login">
		<form:input path="name"/>
		<form:input path="password"/>
		<form:button>ログイン</form:button>
	</form:form>
  </body>
</html>
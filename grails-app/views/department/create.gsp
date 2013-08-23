<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Department</title>
</head>
<body>
	<g:hasErrors bean="${department}">
		<g:renderErrors bean="${department}"/>
	</g:hasErrors>

	<g:form action="create">
		<g:render template="form"/>
		<g:submitButton name="send" value="Create department"/>
		<g:link action="list">List departments</g:link>
	</g:form>
</body>
</html>
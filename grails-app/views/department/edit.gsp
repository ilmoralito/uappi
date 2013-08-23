<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Edit department</title>
</head>
<body>
	<g:hasErrors bean="${department}">
		<g:renderErrors bean="${department}"/>
	</g:hasErrors>

	<g:form action="update">
		<g:hiddenField name="id" value="${params?.id}"/>
		<g:render template="form"/>
		<g:submitButton name="send" value="Create department"/>
		<g:link action="list">List departments</g:link>
	</g:form>
</body>
</html>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Create classroom</title>
</head>
<body>
	<g:hasErrors bean="${classroom}">
		<g:renderErrors bean="${classroom}"/>
	</g:hasErrors>

	<g:form action="create">
		<g:textField name="code" value="${classroom?.code}" placeholder="classroom code" autofocus="true"/>
		<g:textField name="name" value="${classroom?.name}" placeholder="classroom name"/>

		<g:submitButton name="send" value="Create classroom"/>
		<g:link action="list">Classrooms list</g:link>
	</g:form>
</body>
</html>
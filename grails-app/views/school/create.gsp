<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Create school</title>
</head>
<body>
	<g:hasErrors bean="${school}">
		<g:renderErrors bean="${school}"/>
	</g:hasErrors>

	<g:form action="create">
		<g:textField name="name" value="${school?.name}" placeholder="School" autofocus="true"/>
		<g:submitButton name="send" value="Create school"/>
		<g:link action="list">Schools list</g:link>
	</g:form>
</body>
</html>
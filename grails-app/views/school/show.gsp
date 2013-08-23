<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Update school</title>
</head>
<body>
	<g:hasErrors bean="${school}">
		<g:renderErrors bean="${school}"/>
	</g:hasErrors>

	<g:form action="update">
		<g:hiddenField name="id" value="${params.id}"/>
		<label for="name">School name</label>
		<g:textField name="name" value="${school?.name}" placeholder="School" autofocus="true"/>

		<label for="acronym">Acronym</label>
		<g:textField name="acronym" value="${school?.acronym}" placeholder="Acronym"/>

		<g:submitButton name="send" value="Update school"/>
		<g:link action="list">Schools list</g:link>
	</g:form>
</body>
</html>
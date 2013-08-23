<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title><g:layoutTitle deafult="api"/></title>
</head>
<body>
	<g:link uri="/"><h1>uccleon api</h1></g:link>
	<g:layoutBody/>
	<g:if test="${flash.message}">
		<strong>${flash.message}</strong>
	</g:if>
</body>
</html>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Classrooms</title>
</head>
<body>
	<g:link action="create">Create classroom</g:link>
	<br>
	<g:if test="${classrooms}">
		<table class="table">
			<thead>
				<tr>
					<th>Classroom</th>
					<th></th>
				</tr>
			</thead>
			<tbdoy>
				<g:each in="${classrooms}" var="classroom">
					<tr>
						<td>
							<g:if test="${classroom?.name}">
								${classroom.code} [${classroom?.name}]
							</g:if>
							<g:else>
								${classroom.code}
							</g:else>
						</td>
						<td><g:link action="delete" id="${classroom.id}">Delete</g:link></td>
					</tr>
				</g:each>
			</tbdoy>
		</table>
	</g:if>
	<g:else>
		<strong>nothing.to.show</strong>
	</g:else>
</body>
</html>
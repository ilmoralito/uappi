<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Schools</title>
</head>
<body>
	<g:link action="create">Create school</g:link>
	<br>
	<g:if test="${schools}">
		<table class="table">
			<thead>
				<th>School</th>
				<th></th>
			</thead>
			<tbody>
				<g:each in="${schools}" var="school">
					<tr>
						<td><g:link action="show" params="[id:school.id]">${school.name}</g:link></td>
						<td><g:link action="delete" params="[name:school.name]">Delete</g:link></td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</g:if>
	<g:else>
		<strong>nothing.to.show</strong>
	</g:else>
</body>
</html>
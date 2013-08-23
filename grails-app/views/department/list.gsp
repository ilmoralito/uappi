<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Departamentos</title>
</head>
<body>
	<g:link action="create">Create department</g:link>
	<br>
	<g:if test="${departments}">
		<table class="table">
			<thead>
				<th>Department name</th>
				<th></th>
			</thead>
			<tbody>
				<g:each in="${departments}" var="department">
					<tr>
						<td><g:link action="edit" id="${department.id}">${department.name}</g:link></td>
						<td><g:link action="delete" id="${department.id}">Delete</g:link></td>
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
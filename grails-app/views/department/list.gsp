<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="layout" content="main">
	<title>Departamentos</title>
</head>
<body>
	<g:link action="create">Create department</g:link>
	<br>
	<g:if test="${departments}">
		<table class="table">
			<thead>
				<th>Department name</th>
				<th>Manager</th>
				<th>Extention</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
				<g:each in="${departments}" var="department">
					<tr>
						<td><g:link action="show" id="${department.id}">${department.name}</g:link></td>
						<td>${department.manager}</td>
						<td>${department.extention}</td>
						<td><g:link action="edit" id="${department.id}">Edit</g:link></td>
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
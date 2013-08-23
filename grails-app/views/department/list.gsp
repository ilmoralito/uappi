<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Departamentos</title>
</head>
<body>
	<g:form action="list">
		<g:textField name="name" value="${department?.name}" placeholder="Department name" autofocus="true"/>
		<g:submitButton name="send" value="Create department"/>
	</g:form>
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
						<td>${department.name}</td>
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
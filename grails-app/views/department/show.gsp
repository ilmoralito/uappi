<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Show department</title>
</head>
<body>
	<g:link action="list">Departments list</g:link>

	<br><br>

	<strong>Department</strong>
	${department.name}
	<br>
	<strong>Department manager</strong>
	${department.manager}
	<br>
	<strong>Department extention</strong>
	${department.extention}

	<br>

	<g:if test="${department?.members}">
		<h4>Members</h4>
		<table class="table">
			<thead>
				<th>Name</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
				<g:each in="${department.members}" var="member">
					<tr>
						<td>${member.name}</td>
						<td>${member.position}</td>
						<td><g:link controller="member" action="delete" params="[id:member.id, department:department.id]">Delete</g:link></td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</g:if>

	<br>

	<g:hasErrors bean="${member}">
		<g:renderErrors bean="${member}"/>
	</g:hasErrors>

	<g:form controller="member" action="create">
		<g:hiddenField name="id" value="${params.id}"/>
		<g:textField name="name" value="${member?.name}" placeholder="Member name" autofocus="true"/>
		<g:textField name="position" value="${member?.position}" placeholder="Member position"/>

		<g:submitButton name="send" value="Add member"/>
	</g:form>
</body>
</html>
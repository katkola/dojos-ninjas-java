<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
<title>Add License</title>
</head>
<body>
	<div class="addLicense">
			<form:form action="/create/ninja" method="POST" modelAttribute="ninja" class="form-body">
				<div class="form-group">
					<form:label path="firstName">First Name: </form:label>
					<form:input class="form-control" path="firstName"/>
					<form:errors path="firstName"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="lastName">Last Name: </form:label>
					<form:input class="form-control" path="lastName"/>
					<form:errors path="lastName"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="age">State: </form:label>
					<form:input class="form-control" path="age"/>
					<form:errors path="age"></form:errors>
				</div>
				<div class="form-group">
					<form:select path="dojo">
						<c:forEach var="dojo" items="${dojos}">
							<!--- Each option VALUE is the id of the person --->
							<form:option value="${dojo.id}" path="dojo">
								<!--- This is what shows to the user as the option --->
								<c:out value="${dojo.name}" />
							</form:option>
						</c:forEach>
					</form:select>
				</div>
				<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>
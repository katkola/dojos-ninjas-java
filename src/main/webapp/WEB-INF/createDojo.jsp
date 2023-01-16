<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
<meta charset="UTF-8">
<title>Read Share</title>
</head>
<body>
FORM
<div class="addexp">
			<form:form action="/create/dojo" method="POST" modelAttribute="dojo" class="form-body">
				<div class="form-group">
					<form:label path="name">Dojo Name: </form:label>
					<form:input class="form-control" path="name"/>
					<form:errors path="name"></form:errors>
				</div>
				
				<input type="submit" value="Submit" />
			</form:form>
		</div>

</body>
</html>
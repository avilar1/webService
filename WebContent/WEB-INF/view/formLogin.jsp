<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>


	<form action="${linkEntradaServlet }" method="post">
	
	Login: <input type="text" name = "Login"/>
	Senha: <input type="password" name = "Senha"/>
	<input type ="hidden" name="acao" value ="Login"/>
	<input type ="submit"/>
	</form>
</body>
</html>
<%
//scriptlet

//String nomeEmpresa = (String)request.getAttribute("empresa");

//o ${empresa} substitui o  <%= nomeEmpresa % no c�digo e todo resto de cima
//por�m, ele n�o interpreta c�digos mais complicados, como la�o de repeti��o
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
	<body>
	<c:if test="${not empty empresa}">
	Empresa ${ empresa } cadastrado com sucesso e viva Vasco da Gama
	</c:if>
	<c:if test="${empty empresa}">
	Nenhuma empresa cadastrada
	</c:if>
		
	</body>
</html>
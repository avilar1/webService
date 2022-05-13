<%
//scriptlet

//String nomeEmpresa = (String)request.getAttribute("empresa");

//o ${empresa} substitui o  <%= nomeEmpresa % no código e todo resto de cima
//porém, ele não interpreta códigos mais complicados, como laço de repetição
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
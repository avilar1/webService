<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   
    %>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
   <%//não erre o nome! %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Stardard TagLib</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>

Usuario Logado: ${usuarioLogado.login} </br>

<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrado com sucesso e viva Vasco da Gama
	</c:if>

<h1>Lista de empresas:</h1>	

<ul>
	<c:forEach items="${empresas}" var="empresa">
	
		<li> 
		${empresa.nome} - <fmt:formatDate value = "${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 
		<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">Editar </a>
		<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">Remover </a>
		</li>
	</c:forEach>
</ul>

</body>
</html>
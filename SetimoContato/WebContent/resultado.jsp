<!DOCTYPE html>
<%@page import="br.senai.sp.informatica.contato.modelo.Contato"%>
<html>
<head>

</head>
<body>
	<h2>Dados recebidos:</h2>
	<%
		Contato contato = (Contato) request.getAttribute("contato");
		out.write("<h3>Nome: "+contato.getNome()+"</h3>");
		out.write("<h3>Email: "+contato.getEmail()+"</h3>");
	%>
	<h2>Dados recebidos 2:</h2>
	<h3>Nome: ${contato.nome }</h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- <%@ taglib uri="https://www.springframework.org/tags/form" prefix="form" %> -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
    	<h3>Adicionar Produto</h3>
    	<form action="adicionaProduto" method=”post”>
    		Produto:<br> <input type="text" name="nome">    		
    		<form:errors path="nome" cssStyle="color:red" />
    		Quantidade:<br>
    		<input type="number" name="quantidade">
    		<input type="submit" value="Adicionar">
		</form>
	</body>
</html>
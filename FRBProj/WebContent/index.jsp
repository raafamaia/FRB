<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h1 align="center">Sistema de Gerenciamento de Xerox</h1>

<br>

<fieldset align="center">
	<form action="telaPrincipal.html" method="POST">
		<label for="txtUsuario">Usuário:</label>
		<input type="text" name="txtUsuario"> <br>
		<label for="txtSenha">Senha:</label>
		<input type="password" name="txtSenha"> <br> 
		<input type="submit" value="Login"> <br>
	</form>
	<a href="adiciona-aluno.html">Cadastrar-se</a>

</fieldset>
<fieldset>
	<legend>Quem somos</legend>
	<p>Projeto Sistema de Xerox - Laboratório de Programação</p>
</fieldset>
</body>
</html>
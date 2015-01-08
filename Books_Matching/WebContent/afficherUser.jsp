<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.UTC.BooksMatching.Beans.User"%>
<%@page import="com.UTC.BooksMatching.dao.UserDao"%>
<%@page import="com.UTC.BooksMatching.Beans.Admin"%>
<%@page import="com.UTC.BooksMatching.dao.AdminDao"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Affichage utilisateur</title>
	</head>
	<body>
		<p>${message }</p>
		<p>Affichage de l'utilisateur</p><br><br>
		Nom : ${user.nom }<br>
		Adresse : ${user.adresse }<br>
		Telephone : ${user.telephone }<br>
		Date de création du compte : ${user.dateCreation }<br>
		Statut du compte : ${user.statutCompte }<br>
		
		<%
		List<User> listeU = UserDao.findall();
		if(listeU!=null){
			for(User u : listeU){
			%>
			<tr>
				<td><%=u.getId()%></td>
				<td><%=u.getNom()%></td>
				<td>
					<a href="">Supprimer</a>
					<a href="">Modifier</a>	
				</td>
			</tr>
		<%
			}
			
			
		}
		%>
		
		
	
	</body>
</html>
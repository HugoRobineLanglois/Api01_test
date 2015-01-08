<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Welcome...</title>
	</head>
	<body>
		<%@ include file="EnTete.jsp"  %>
		<h1>Welcome to the app, please login :</h1>
		<form method="post" action="LoginServlet">
	        <fieldset>
	            <legend>Informations utilisateur</legend>
	
	            <label for="name">Login <span class="requis">*</span></label>
	            <input type="text" id="name" name="name" value="" size="20" maxlength="20" />
	            <br />
	            
	            <label for="pwd"> Password <span class="requis">*</span></label>
	            <input pattern=".{8,}" required title="8 characters minimum" type="password" name="pwd" id="pwd" >
	            <br />
	            
	        </fieldset>
	        <input type="submit" value="Valider"  />
	        <input type="reset" value="Remettre à zéro" /> <br />
	    </form>
	</body>
</html>
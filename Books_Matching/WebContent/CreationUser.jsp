<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Création d'utilisateur</title>
</head>
<body>
	<div>
	    <form method="get" action="creationUser">
	        <fieldset>
	            <legend>Informations utilisateur</legend>
	
	            <label for="nomUser">Nom <span class="requis">*</span></label>
	            <input type="text" id="nomUser" name="nomUser" value="" size="20" maxlength="20" />
	            <br />
	
	            <label for="adresseUser">Adresse<span class="requis">*</span></label>
	            <input type="text" id="adresseUser" name="adresseUser" value="" size="20" maxlength="20" />
	            <br />
	
	            <label for="telephoneUser">Numéro de téléphone<span class="requis">*</span></label>
	            <input type="text" id="telephoneUser" name="telephoneUser" value="" size="20" maxlength="20" />
	            <br />
	            
	            <label for="mdpUser">Mot de passe<span class="requis">*</span></label>
	            <input type="password" id="mdpUser" name="mdpUser" value="" size="20" maxlength="20" />
	            <br />
	            
	        </fieldset>
	        <input type="submit" value="Valider"  />
	        <input type="reset" value="Remettre à zéro" /> <br />
	    </form>
	</div>
</body>
</html>
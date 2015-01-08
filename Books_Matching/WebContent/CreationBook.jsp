<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajout d'un nouveau livre</title>
</head>
<body>
	<div>
	    <form method="get" action="creationBook">
	        <fieldset>
	            <legend>Informations concernant le livre</legend>
	
	            <label for="titreBook">Titre <span class="requis">*</span></label>
	            <input type="text" id="titreBook" name="titreBook" value="" size="20" maxlength="20" />
	            <br />
	
	            <label for="auteurBook">Auteur<span class="requis">*</span></label>
	            <input type="text" id="auteurBook" name="auteurBook" value="" size="20" maxlength="20" />
	            <br />
	
	            <label for="editeurBook">Editeur<span class="requis">*</span></label>
	            <input type="text" id="editeurBook" name="editeurBook" value="" size="20" maxlength="20" />
	            <br />
	            
	            <label for="datePublicationBook">Date de publication<span class="requis">*</span></label>
	            <input type="text" id="datePublicationBook" name="datePublicationBook" value="" size="20" maxlength="20" />
	            <br />
	            
	            <label for="ISBNBook">ISBN<span class="requis">*</span></label>
	            <input type="text" id="ISBNBook" name="ISBNBook" value="" size="20" maxlength="20" />
	            <br />
	            
	            <label for="genreBook">Genre du livre<span class="requis">*</span></label>
				<select id="genreBook" name="genreBook">
				  <optgroup label="Roman">
				  	<option> Roman courtois</option>
					<option> Roman historique </option>
					<option> Roman épistolaire </option>
					<option> Roman-mémoires</option>
					<option> Roman d'amour </option>
					<option> Roman industriel </option>
					<option> Nouvelle fiction </option>
					<option> Non-fiction </option>
					<option>Roman noir</option>
					<option>Roman policier</option>
					<option>Roman d'espionnage</option>
					<option>Mondes perdus</option>
					<option> Science-fiction </option>
					<option> Fantasy </option>
					<option> Fantastique </option>
					<option> Horreur </option>
				  </optgroup>
				  <optgroup label="Biographie">
					 <option> Autobiographie</option>
					<option>Autofiction</option>
					<option>Journal intime</option>
					<option>Mémoires</option>
				  </optgroup>
			   	  <option>Conte</option>
			   	  <option>Epopée</option>
			   	  <option>Nouvelle</option>
				  <optgroup label="Nanolittérature">
				    <option>Micronouvelle</option>
					<option>Twittérature</option>
					<option>Fragment</option>
				  </optgroup>
				  <option> Témoignage </option>
				  <optgroup label="Poésie">
				    <option>Ballade</option>
					<option>Calligramme</option>
					<option>Chanson</option>
					<option>Chant royal</option>
					<option>Élégie</option>
					<option>Épigramme</option>
					<option>Épopée</option>
					<option>Fable</option>
					<option>Fatrasie</option>
					<option>Haïku</option>
					<option>Lai</option>
					<option>Miscellanées</option>
					<option>Motet</option>
					<option>Nouvelle</option>
					<option>Ode</option>
					<option>Pastourelle</option>
					<option>Poème autobiographique</option>
					<option>Poésie en prose</option>
					<option>Poésie philosophique</option>
					<option>Poème de cinq lignes</option>
					<option>Oaristys</option>
					<option>Rondeau</option>
					<option>Rondel</option>
					<option>Triolet</option>
					<option>Sestina</option>
					<option>Sextine</option>
					<option>Serventois</option>
					<option>Sirvente</option>
					<option>Sonnet</option>
					<option>Villanelle</option>
				  </optgroup>
				  <optgroup label="Théâtre">
				    <option>Tragédie</option>
					<option>Comédie</option>
					<option>Tragicomédie</option>
					<option>Sotie</option>
					<option>Farce</option>
					<option>Moralité</option>
					<option>Drame</option>
					<option>Miracle</option>
					<option>Mystère</option>
					<option>Proverbe</option>
				  </optgroup>
				</select>									
	            <br />
	            
	        </fieldset>
	        <input type="submit" value="Valider"  />
	        <input type="reset" value="Remettre à zéro" /> <br />
	    </form>
	</div>
</body>
</html>
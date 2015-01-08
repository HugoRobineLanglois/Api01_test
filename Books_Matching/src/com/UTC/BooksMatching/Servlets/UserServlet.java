package com.UTC.BooksMatching.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.UTC.BooksMatching.Beans.User;
import com.UTC.BooksMatching.dao.UserDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String sid = request.getParameter("id");
		String nom = request.getParameter("nomUser");
		String adresse = request.getParameter("adresseUser");
		String telephone = request.getParameter("telephoneUser");
		DateTime dt = new DateTime();
		DateTimeFormatter form = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
		String date = dt.toString(form);
		String statutCompte = "inactif"; //inactif par défaut & confirmation de qc pour l'activer ? 
		String mdp = request.getParameter("mdpUser");
		
		String message;
		if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"CreationUser.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un utilisateur.";
        } else {
            message = "Utilisateur créé avec succès !";
        }
		
		//int id = Integer.parseInt(sid);
		//User user = new User(id, nom, mdp, adresse, telephone, date, statutCompte);
		User user = new User(nom, mdp, adresse, telephone, date, statutCompte);
		
		request.setAttribute("user", user);
		request.setAttribute("message", message);
		
		UserDao.insert(user);
		
		this.getServletContext().getRequestDispatcher( "/afficherUser.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.UTC.BooksMatching.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UTC.BooksMatching.Beans.Admin;


/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String pwd = request.getParameter("pwd");
		String adresse = request.getParameter("adresse");
		
		String message;
		if ( nom.trim().isEmpty() || pwd.trim().isEmpty()) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"CreationAdmin.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un administrateur.";
        } else {
            message = "Administrateur créé avec succès !";
        }
		
		Admin a = new Admin(0, nom, pwd, adresse);
		a.setNom(nom);
		a.setAdresse(adresse);

		
		request.setAttribute("Admin", a);
		request.setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher( "/afficherAdmin.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

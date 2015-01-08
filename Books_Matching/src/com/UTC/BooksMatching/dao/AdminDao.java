package com.UTC.BooksMatching.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.UTC.BooksMatching.Beans.Admin;

public class AdminDao {
	
	public static int insert (Admin a){
		int res = 0;
		
		Connection cnx=null;
		try{
			cnx = ConnexionBDD.getInstance().getCnx();
			PreparedStatement preparedStatement = cnx.prepareStatement("INSERT"
					+ " INTO administrateurs(id, nom, pwd) VALUES (null, ?, ?, ? );");
			preparedStatement.setString(1,a.getNom());
			preparedStatement.setString(3,a.getNom());
			preparedStatement.setString(4,a.getPwd());
			res = preparedStatement.executeUpdate();
			
			return res;
			
		} catch (SQLException e){
			return res;
		}
	}
	
	public static int delete (int id){
		int res = 0;
		
		Connection cnx=null;
		try{
			cnx = ConnexionBDD.getInstance().getCnx();
			PreparedStatement preparedStatement = cnx.prepareStatement("DELETE FROM administrateurs WHERE id=?;");
			preparedStatement.setInt(1,id);
			res = preparedStatement.executeUpdate();
			
			return res;
			
		} catch (SQLException e){
			return res;
		}
	}
	
	public static int update (Admin a){
		int res = 0;
		int id;
		String nom, adresse, pwd;
		
		Connection cnx=null;
		
		try{		
			cnx = ConnexionBDD.getInstance().getCnx();	
			PreparedStatement ps = cnx.prepareStatement("SELECT id, nom, pwd, adresse FROM administrateurs WHERE id = ?;");
			ps.setString(1, "i");
			ResultSet rs = ps.executeQuery();
			id = rs.getInt("id");
			nom = rs.getString("nom");
			pwd = rs.getString("pwd");
			adresse = rs.getString("adresse");
			
			if(id!= a.getId())
				id=a.getId();
			if(nom!=a.getNom())
				nom=a.getNom();
			if(a.getAdresse()!=adresse)
				adresse=a.getAdresse();
			if(pwd!=a.getPwd())
				pwd=a.getPwd();
			
			cnx = ConnexionBDD.getInstance().getCnx();
			PreparedStatement preparedStatement = cnx.prepareStatement("UPDATE administrateurs"
					+ " SET id=?, nom=?, tel=?, adresse=?, pdw=? WHERE id=?;");
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,nom);
			preparedStatement.setString(3,adresse);
			preparedStatement.setString(4,pwd);
			res = preparedStatement.executeUpdate();
			
			return res;
			
		} catch (SQLException e){
			return res;
		}
	}
	
	
	public static java.util.List<Admin> findall(){
		java.util.List<Admin> lu = new ArrayList<Admin>();
		Connection cnx = null;
		try{
			cnx = ConnexionBDD.getInstance().getCnx();
			java.sql.PreparedStatement statement = cnx.prepareStatement("SELECT id,nom,tel,pwd FROM administrateurs;");
	
			ResultSet res = statement.executeQuery();

			while (res.next()){
				lu.add(new Admin(res.getInt("id"),res.getString("nom"), res.getString("pwd"), res.getString("tel")));
			}
			
	
			res.close();
	
			ConnexionBDD.getInstance().closecnx();
	
			return lu;

		} catch(SQLException e){
			e.printStackTrace();
			return lu;
		}
	}
}

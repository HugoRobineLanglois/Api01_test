package com.UTC.BooksMatching.Beans;

import java.io.Serializable;

public class Admin implements Serializable, Comparable<Admin>{
	private int id;
	private String nom; 
	private String pwd;
	private String adresse;
	
	
	public Admin(int id, String nom, String pwd, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.pwd = pwd;
		this.adresse = adresse;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	@Override
	public int compareTo(Admin arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

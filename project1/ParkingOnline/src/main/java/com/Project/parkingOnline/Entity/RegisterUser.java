package com.Project.parkingOnline.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class RegisterUser {

	private String name  ;
	private String sirname ;
	private String email ;
	@Id
	private String username ;
	private String password ;
	
	
	public RegisterUser(String name, String sirname, String email, String username, String password) {
		super();
		this.name = name;
		this.sirname = sirname;
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public RegisterUser() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSirname() {
		return sirname;
	}


	public void setSirname(String sirname) {
		this.sirname = sirname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "RegisterUser [name=" + name + ", sirname=" + sirname + ", email=" + email + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}

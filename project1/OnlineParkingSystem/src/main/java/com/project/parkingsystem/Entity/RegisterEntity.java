package com.project.parkingsystem.Entity;

public class RegisterEntity {

	private String name ;
	private long contact ;
	private String email ;
	private String username ;
	private String password ;
	
	
	public RegisterEntity(String name, long contact, String email, String username, String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public RegisterEntity() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
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
		return "RegisterEntity [name=" + name + ", contact=" + contact + ", email=" + email + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}

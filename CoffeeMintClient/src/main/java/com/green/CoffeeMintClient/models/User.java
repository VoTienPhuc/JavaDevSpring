package com.green.CoffeeMintClient.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="userID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String username;
	private String password;
	private boolean enable;
	
	public User() {
		
	}
	
	public User(int userID, String username, String password, boolean enable) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.enable = enable;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
}

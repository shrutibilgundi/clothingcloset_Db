package com.clothingcloset.models;

public class PBLStaff {

	private String email;
	private String password;
	private Integer id;
	private String pblPosition;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPblPosition() {
		return pblPosition;
	}
	public void setPblPosition(String pblPosition) {
		this.pblPosition = pblPosition;
	}
}

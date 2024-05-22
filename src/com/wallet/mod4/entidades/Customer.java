/**
 * 
 */
package com.wallet.mod4.entidades;

/**
 * 
 */
public class Customer {
	private String name; 
	private String rut;
	private String email; 
	private String phone; 
	
	public Customer(String name, String rut, String email, String phone) {
		this.name = name;
		this.rut = rut;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	
}

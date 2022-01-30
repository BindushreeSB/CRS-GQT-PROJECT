/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Bindu
 *
 * 
 */
public class Professor {
	private int professor_Id;
	private String professor_name;
	private String professor_email;
	private String professor_password;
	public Professor(int professor_Id, String professor_name, String professor_email, String professor_password) {
		super();
		this.professor_Id = professor_Id;
		this.professor_name = professor_name;
		this.professor_email = professor_email;
		this.professor_password = professor_password;
	}
	public int getProfessor_Id() {
		return professor_Id;
	}
	public void setProfessor_Id(int professor_Id) {
		this.professor_Id = professor_Id;
	}
	public String getProfessor_name() {
		return professor_name;
	}
	public void setProfessor_name(String professor_name) {
		this.professor_name = professor_name;
	}
	public String getProfessor_email() {
		return professor_email;
	}
	public void setProfessor_email(String professor_email) {
		this.professor_email = professor_email;
	}
	public String getProfessor_password() {
		return professor_password;
	}
	public void setProfessor_password(String professor_password) {
		this.professor_password = professor_password;
	}
	
	
}

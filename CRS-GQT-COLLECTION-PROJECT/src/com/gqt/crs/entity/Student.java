/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Bindu
 *
 */
public class Student {
	private int student_id;
	private String student_name;
	private String student_email;
	private String student_password;
	/**
	 * @param student_id
	 * @param student_name
	 * @param student_email
	 * @param student_password
	 */
	public Student(int student_id, String student_name, String student_email, String student_password) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_password = student_password;
	}
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}
	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	/**
	 * @return the student_password
	 */
	public String getStudent_password() {
		return student_password;
	}
	/**
	 * @param student_password the student_password to set
	 */
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	
	
}

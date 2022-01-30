/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Bindu
 *
 * 
 */
public class Course {
	private int course_Id;
	private String course_name;
	private String course_dur;
	private String course_fees;
	public Course(int course_Id, String course_name, String course_dur, String course_fees) {
		super();
		this.course_Id = course_Id;
		this.course_name = course_name;
		this.course_dur = course_dur;
		this.course_fees = course_fees;
	}
	public int getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_dur() {
		return course_dur;
	}
	public void setCourse_dur(String course_dur) {
		this.course_dur = course_dur;
	}
	public String getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(String course_fees) {
		this.course_fees = course_fees;
	}
	
	
}

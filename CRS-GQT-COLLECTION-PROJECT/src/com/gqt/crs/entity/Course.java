/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Bindu
 *
 */
public class Course {
	private int course_id;
	private String course_name;
	private int course_duration;
	private int course_fees;
	/**
	 * @param course_id
	 * @param course_name
	 * @param course_duration
	 * @param course_fees
	 */
	public Course(int course_id, String course_name, int course_duration, int course_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.course_fees = course_fees;
	}
	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}
	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	/**
	 * @return the course_duration
	 */
	public int getCourse_duration() {
		return course_duration;
	}
	/**
	 * @param course_duration the course_duration to set
	 */
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	/**
	 * @return the course_fees
	 */
	public int getCourse_fees() {
		return course_fees;
	}
	/**
	 * @param course_fees the course_fees to set
	 */
	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}
	
}

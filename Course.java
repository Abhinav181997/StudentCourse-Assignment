package com.capgemini.beans;

public class Course {
	private int courseID;
	private String courseName;

	public Course(int courseID, String courseName) {
		super();

		this.courseName = courseName;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
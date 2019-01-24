package com.capgemini.beans;

import com.capgemini.beans.Course;

public class Student {

	private int rollNumber;
	private String name;

	private Course[] course;

	public Course[] getCourses() {
		return course;
	}

	public void setCourses(Course[] courses) {
		this.course = courses;
	}

	public Student(int rollNumber, String name, Course[] course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
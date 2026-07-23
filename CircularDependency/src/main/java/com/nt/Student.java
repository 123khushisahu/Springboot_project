package com.nt;

public class Student {
private Course course;
public void setCourse(Course course) {
	this.course=course;
}
public void show() {
	System.out.println(course.getName()););
}
}

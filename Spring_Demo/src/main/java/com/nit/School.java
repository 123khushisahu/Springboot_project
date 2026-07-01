package com.nit;

public class School {

	Student student;
	
	School(Student student){
		this.student=student;
	}
	
	void resister() {
		System.out.println("resister method is called...");
		student.present();
		
	}
	public static void main(String[] args) {
		 Student  s= new Student();
		School obj=new School(s);
		obj.resister();
	}
}

package com.day18;

public class Main {
public static void main(String[] args) {
	//in this way we cannot read the content of the annotation
	University university=new University();
	System.out.println(university);
	//this is the way we canread the annotation
	Class<University> ref=University.class;
	Student annotation=ref.getAnnotation(Student.class);
	System.out.println("ID:"+annotation.id());
	System.out.println("Name:"+annotation.name());
}
}

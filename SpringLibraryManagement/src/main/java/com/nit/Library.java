package com.nit;

import java.util.List;

public class Library {
private int libraryCode;
private String libraryName;
private String inChargePerson;
private long contactNumber;
private List<String> genres;

public Library() {
	System.out.println("library object created...");
}
public Library(String libraryName) {
	this.libraryName = libraryName;
}
public void setLibraryName(String libraryName) {
	this.libraryName=libraryName;
	System.out.println("libraryname setter injection completed");
	
}
public void setInChargePerson(String inChargePerson) {
	this.inChargePerson=inChargePerson;
	System.out.println("InChargePerson Setter Injection Completed");
	
}
public void setcontactNumber(long contactNumber) {
	this.contactNumber=contactNumber;
	System.out.println("contact Number Setter Injection Completed");
	
}
public void setgenres(List<String> genres) {
	this.genres=genres;
	System.out.println("Genres Settter Injection Completed");
}
public void generateLibraryCode() {
	libraryCode=(int)(Math.random()*10000);
	System.out.println("Library Code Generated :"+libraryCode);
}
public void destroy() {
	libraryCode=0;
	libraryName=null;
	inChargePerson=null;
	contactNumber=0;
	genres=null;
	System.out.println("Library Bean Destroyed");
}
@Override
public String toString() {
	return "Library [libraryCode="+libraryCode+", libraryName="+libraryName
			+", inChargePerson="+inChargePerson
+", contactNumber="+contactNumber+
", genres="+genres+"]";
	
	System.out.println(library);
}


}

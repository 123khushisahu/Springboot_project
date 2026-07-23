package com.nt;
//1. Hospital.java – Bean with Life Cycle Callbacks
import java.util.List;

public class Hospital {
	private int hospitalCode;
	private String hospitalName;
	private String contactPerson;
	private long contactNumber;
	private List<String> treatment;
	
	private static int uniqueNumber = 1;
	
	public Hospital() {
		System.out.println("Hospital Class object created!");
		}
	public Hospital(String hospitalName) {
		this.hospitalName=hospitalName;
	}
	public void init() {
		System.out.println("Post constructio logic done");
		this.hospitalCode = uniqueNumber++;
		}
	public int getHospitalCode() {
		return hospitalCode;
		}
	public void setHospitalCode(int hospitalCode) {
		System.out.println("SETTER INJECTION DONE FOR HOSPITAL CLASS");
		this.hospitalCode = hospitalCode;
		}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		System.out.println("setter Injection Done For Object Class..");
		this.hospitalName=hospitalName;
	}
	public String getcontactPerson() {
		return contactPerson;
	}
	public void setcontactPerson(String contactPerson) {
		System.out.println("setter InjectionDone FoneFor HospitalClass");
		this.contactPerson=contactPerson;
	}
	public long getcontactNumber() {
		return contactNumber;
	}
	public void setcontactNumber(long contactNumber) {
		System.out.println("setter Injection Done For Hospital Class");
		this.contactNumber=contactNumber;
	}
	public List<String> getTreatment(){
		return treatment;	
	}
	public void setTreatment(List<String> treatment) {
		System.out.println("Setter Injection Done For Hospital Class..");
		this.treatment=treatment;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalCode="+hospitalCode+",hospitalName="+hospitalName+ ",contactPerson="+contactPerson+
				",contactNumber="+contactNumber+",treatment="+treatment+"]";
	}
	public void destroy() {
		System.out.println("Post destruction logic executed");
		this.contactNumber=0;
		this.contactPerson="null";
		this.hospitalName="null";
		this.hospitalCode=0;
		this.treatment=null;
	
}}

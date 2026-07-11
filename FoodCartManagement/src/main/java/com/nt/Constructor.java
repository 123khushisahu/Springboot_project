package com.nt;

public class Constructor {

	int a;
	
	
	public Constructor(int a) {
		
		this.a = a;
	}


	public static void main(String[] args) {
		Constructor obj=new Constructor(1);
		System.out.println(obj.a);
	}

}

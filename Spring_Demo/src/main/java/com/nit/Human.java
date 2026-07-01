package com.nit;
 class Heart{
	 void pump() {
		 System.out.println("Heart is pumping");
	 }
 }
public class Human {
	public static void main(String[] args) {
		Heart heart=new Heart();
		heart.pump();
	}

}

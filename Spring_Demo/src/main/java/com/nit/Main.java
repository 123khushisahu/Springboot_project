package com.nit;

 class Ao {
public int m01() {
	try {
		int y=1;
		if(y==1) {
			System.out.println("hii");
		}
		}
	catch (Exception e) {
		e.printStackTrace();
		
		}
	return 0;
	
	


}
}
class Bo //extends Ao{
	public void m2(){
		System.out.println("hi!!!!");
		
	}
	public int m3(int i){
		System.out.println(i);
		return 0;
	}
	public void m01() {
		
	}
}
public class Main{
	public static void main(String[] args) {
		//Bo obj=new Bo();
		Ao obj;
		obj.m01();
		obj.m3(4);
	}
}
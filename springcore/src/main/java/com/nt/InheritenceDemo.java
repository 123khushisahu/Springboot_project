package com.nt;
class A01{
	public int m1() {
		return 10;
	}
	public int m2() {
		return 20;
	}
	public void m3() {
System.out.println("hello");	
	}
}
class B01 
//extends A01
{
	A01 REF;
	public int m4() {
		REF.m2();
		return 100;
	}
	
}
public class InheritenceDemo {

	public static void main(String[] args) {
		B01 b01=new B01();
		b01.m1();
		b01.m2();
		b01.m3();
		b01.m4();
	}

}

package com.nit;
/*IS-A Relationship

Meaning:

If we can say:

Child IS A Parent

then inheritance is appropriate.

Real-life Examples
Dog is an Animal ✅
Car is a Vehicle ✅
Teacher is a Person ✅*/
class A{
	public void m1() {
		System.out.println("hii!!!");
	}
}
class B extends A{
	public int m2() {
		System.out.println("Hello");
		return 0;
	}
}
public class Is_A_Relationship {
public static void main(String[] args) {
	B obj=new B();
	obj.m1();
	obj.m2();
}
}

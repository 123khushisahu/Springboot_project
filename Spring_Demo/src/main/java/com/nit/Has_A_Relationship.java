package com.nit;
/*HAS-A Relationship (Composition)

Meaning:

One class contains another class as a member (object).

It is implemented by creating an object inside another class.

Real-life Examples
Car has an Engine
Computer has a CPU
School has Students*/
class Account{
	void accountDetails() {
		System.out.println("saving Account!!");
	}
}
class Bank{
	Account account=new Account();
	void bankDetails() {
		System.out.println("Welcome to SBI Bank!!");
		account.accountDetails();
	}
}
public class Has_A_Relationship {
	
public static void main(String[] args) {
	Bank obj=new Bank();
	obj.bankDetails();
	
}
}

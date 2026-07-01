package com.nit;
class Engine1{
	void start() {
		System.out.println("Engine Started");
	}
}
class Car1{
	Engine1 engine;
	public Car1(Engine1 engine1) {
		// TODO Auto-generated constructor stub
	}
	void drive() {
		engine.start();
		System.out.println("Car is Running");
	}
}
public class withoutconstructor {
	public static void main(String[] args) {
//		Car1 car=new Car1();
//		car.engine=new Engine1();
		
		Car1 car=new Car1(new Engine1());
		
	}

}

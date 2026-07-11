package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
Foodcart cart=ctx.getBean("cart",Foodcart.class);
System.out.println(cart);
((ClassPathXmlApplicationContext) ctx).close();
	}

}

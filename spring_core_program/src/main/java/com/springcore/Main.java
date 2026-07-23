package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/src/main/java/applicationcontext.xml");
		Robot bean=context.getBean("robot",Robot.class);
		System.out.println(bean);
	}

}

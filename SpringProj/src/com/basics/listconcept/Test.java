package com.basics.listconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basics/listconcept/config.xml");
		Hospital h = (Hospital) context.getBean("hospital");
		System.out.println("Hospital:" + h.getName());
		System.out.println("List of departments:" + h.getDepartment());
	}

}

package com.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basics/config.xml");
//		Employee emp1 = new Employee();
		Employee emp1 = (Employee) context.getBean("emp");
		
		System.out.println("id:" + emp1.getId());
		System.out.println("namee:" + emp1.getname());
		
Employee emp2 = (Employee) context.getBean("emp1");
		
		System.out.println("id:" + emp2.getId());
		System.out.println("namee:" + emp2.getname());
		
Employee emp3 = (Employee) context.getBean("emp2");
		
		System.out.println("id:" + emp3.getId());
		System.out.println("namee:" + emp3.getname());

	}

}

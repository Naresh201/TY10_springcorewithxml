package com.te.SpringCoreXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		     Employee employee = (Employee)  context.getBean("emp1");
		     System.out.println(employee.getId());
		     System.out.println(employee.getName());
	}
}

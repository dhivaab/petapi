package com.blueocean.springcorelearnings.firstlesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/firstlesson/config.xml");
    	Employee emp = (Employee) ctx.getBean("emp");
    	System.out.println(emp.getId());
    	System.out.println(emp.getName());
    	
    	Employee emp1 = (Employee) ctx.getBean("emp1");
    	System.out.println(emp1.getId());
    	System.out.println(emp1.getName());
    	
    	College col1 = (College) ctx.getBean("col1");
    	System.out.println(col1.getColleges());
    	

    	Road road = (Road) ctx.getBean("road");
    	System.out.println(road.getCars());
    	
    	Customer cust = (Customer) ctx.getBean("cust");
    	System.out.println(cust.getProducts());
    	
    	Language langs = (Language) ctx.getBean("langs");
    	System.out.println(langs.getCountrylangs());
    	
    	Student students = (Student) ctx.getBean("students");
    	System.out.println(students.getId());
    	System.out.println(students.getClass());


    }
}

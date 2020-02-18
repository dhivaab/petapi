package com.blueocean.springcorelearnings.fourlesson;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/fourlesson/config.xml");
         
    	 // typical annotatinos
         Company emp = (Company) ctx.getBean("company");
     	System.out.println(emp.toString());
     	
     	// scope class singleton annotations
     	Scope1Class scp = (Scope1Class)ctx.getBean("scope1class");
     	System.out.println(scp.hashCode());
    	Scope1Class scp1 = (Scope1Class)ctx.getBean("scope1class");
     	System.out.println(scp1.hashCode());

     	// scope class prototype annotations 
     	Scope2Class scp2 = (Scope2Class)ctx.getBean("scope2class");
     	System.out.println(scp2.hashCode());
     	Scope2Class scp3 = (Scope2Class)ctx.getBean("scope2class");
     	System.out.println(scp3.hashCode());
     	
     	//@value annotation
     	Perimeter ps1 = (Perimeter)ctx.getBean("perimeter");
     	System.out.println(ps1.getId());
     	System.out.println(ps1.getName());

     	//@value annotation collection type
     	Book bk1 = (Book)ctx.getBean("book");
     	System.out.println(bk1.getId());
     	System.out.println(bk1.getNames());
     	
     	//@value annotation objects
     	Junk jk = (Junk)ctx.getBean("junk");
     	System.out.println(jk.getReport().getName());
     	
     	//@value spring expression language
     	Cognizant cognizant = (Cognizant)ctx.getBean("cognizant");
     	System.out.println(cognizant.toString());
     	
    }
}

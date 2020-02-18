package com.blueocean.springcorelearnings.secondlesson;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blueocean.springcorelearnings.secondlesson.Patient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/secondlesson/config.xml");
        
        Patient emp = (Patient) ctx.getBean("pat");
    	System.out.println(emp.getId());
    	System.out.println(emp.getName());
    	ctx.registerShutdownHook();
    	

        Employee emp1 = (Employee) ctx.getBean("emp");
    	System.out.println(emp1.getId());
    	System.out.println(emp1.getName());
    	ctx.registerShutdownHook();
    	
    	Student emp2 = (Student) ctx.getBean("stu");
     	System.out.println(emp2.getId());
     	System.out.println(emp2.getName());
     	ctx.registerShutdownHook();
     	
     	Notes note1 = (Notes) ctx.getBean("note");
     	System.out.println(note1.getId());
     	System.out.println(note1.getName());
     	
     	Address add = (Address)ctx.getBean("address");
     	System.out.println(add.getId());
     	System.out.println(add.getStreet().getName());
     	System.out.println(add.getStreet().getNumber());
     	
     	BeanScope b1 = (BeanScope) ctx.getBean("b1");
     	System.out.println(b1.getId());
     	System.out.println(b1.getName());
     	System.out.println(b1.hashCode());
     	
     	BeanScope b2 = (BeanScope) ctx.getBean("b1");
     	System.out.println(b2.getId());
     	System.out.println(b2.getName());
     	System.out.println(b2.hashCode());
     	
    	BeanScope b3 = (BeanScope) ctx.getBean("b2");
     	System.out.println(b3.getId());
     	System.out.println(b3.getName());
     	System.out.println(b3.hashCode());
     	
    	BeanScope b4 = (BeanScope) ctx.getBean("b2");
     	System.out.println(b4.getId());
     	System.out.println(b4.getName());
     	System.out.println(b4.hashCode());
     	
    	House house = (House) ctx.getBean("cost");
     	System.out.println(house.toString());
     	
     	Road rd = (Road) ctx.getBean("road");
     	System.out.println(rd.toString());

     	Example ex = (Example)ctx.getBean("example");
     	System.out.println(ex.toString());
     	
     	Example ex1 = (Example)ctx.getBean("example1");
     	System.out.println(ex1.toString());
     	
    	Database db1 = (Database)ctx.getBean("database1");
     	System.out.println(db1.toString());
     	

     	
    }
}

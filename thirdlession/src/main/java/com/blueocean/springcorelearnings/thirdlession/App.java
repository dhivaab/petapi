package com.blueocean.springcorelearnings.thirdlession;

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

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/thirdlession/config.xml");
        
        Employee emp = (Employee) ctx.getBean("employee"); 
        System.out.println(emp.getId());
        System.out.println(emp.getAddress().getName());
        
        College col1 = (College) ctx.getBean("college"); 
        System.out.println(col1.getAddress().getName());
        

        Nut nut = (Nut) ctx.getBean("nut"); 
        System.out.println(nut.getName());
        System.out.println(nut.getMetal().getId());

        

        Bolt bolt = (Bolt) ctx.getBean("bolt"); 
        System.out.println(bolt.getMetal().getId());
        

        ProductList productlist = (ProductList) ctx.getBean("productlist"); 
        System.out.println(productlist.getProducts());

    }
}

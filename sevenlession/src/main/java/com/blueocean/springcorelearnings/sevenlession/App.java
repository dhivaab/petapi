package com.blueocean.springcorelearnings.sevenlession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/sevenlession/config.xml");
       OrderService orderservice = (OrderService)context.getBean("orderservice");
       int c = orderservice.Addition(1, 3, 4);
       System.out.println("sum is " + c);
       
       int d = orderservice.Multiplication(1,3);
       System.out.println("multiply is " + d);

       }
}

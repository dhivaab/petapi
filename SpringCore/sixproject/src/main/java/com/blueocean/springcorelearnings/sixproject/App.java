package com.blueocean.springcorelearnings.sixproject;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/blueocean/springcorelearnings/sixproject/config.xml");
    	OrderBAO orderbao = (OrderBAO) context.getBean("orderbao");
    	orderbao.submitOrder();   
    	}
}

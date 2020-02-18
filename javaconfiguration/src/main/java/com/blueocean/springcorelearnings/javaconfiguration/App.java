package com.blueocean.springcorelearnings.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Dao dao = (Dao)context.getBean(Dao.class);
        dao.createDao();
        
       service service1 = context.getBean(service.class);
       service1.save();
    }
}

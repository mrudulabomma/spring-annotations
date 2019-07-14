package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =new  AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie=(Movie)applicationContext.getBean("firstmovie");
       Movie movie1=(Movie)applicationContext.getBean("secondmovie");
        System.out.println( movie.getActor());
       System.out.println( movie1.getActor());

    }
}

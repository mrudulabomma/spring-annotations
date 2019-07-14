package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        BeanFactory factory= new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m=(Movie)factory.getBean("movie");
        m.displayInfo();

     ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       Movie m2=(Movie)context.getBean("movie");
       m2.displayInfo();


    }
}

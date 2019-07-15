package com.stackroute;

import com.stackroute.domain.ActorConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main( String[] args ) {

        //Using ApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ActorConfig.class);
        Movie firstMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        firstMovie.displayInformation();

        Movie secondMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        secondMovie.displayInformation();

        if(firstMovie == secondMovie) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

}

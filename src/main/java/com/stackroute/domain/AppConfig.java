package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Actor actorBean(){
        Actor actor=new Actor();

        return actor;
    }


    @Bean(value={"firstmovie"},initMethod = "initMethod")
    public Movie movieBean(){
        Movie movie=new Movie(actorBean());
        return movie;
    }
    @Bean(value={"secondmovie"},initMethod = "initMethod")
    public Movie movie1(){
        Movie movie=new Movie();
        return movie;
    }
}

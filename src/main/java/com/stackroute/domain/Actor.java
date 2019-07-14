package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    String name;
    String gender;
    int age;
     @Required
     @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }
    @Required
    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Required
    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;
    }
    public void displayActorInfo(){
        System.out.println("Actor Name : " +name+ "\t" + "Actor Gender : "   +gender+ "\t" +  "Actor Age : " +age);
    }
}

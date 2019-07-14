package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Name;

public class Movie{
@Autowired
    Actor actor;
public  Movie(){}
@Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void initMethod() {
        actor = new Actor("ABC", "Female", 12);
    }
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}

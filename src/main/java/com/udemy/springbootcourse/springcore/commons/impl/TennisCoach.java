package com.udemy.springbootcourse.springcore.commons.impl;

import com.udemy.springbootcourse.springcore.commons.interf.Coach;
import org.springframework.stereotype.Component;

// @Scope changes de lifecycle of the bean to prototype meaning 1 instance per container, is Singleton By default
//Prototype beans are lazy by default. There is no need to use the @Lazy annotation for prototype scopes beans.
@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Deploying: "+ this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise drive for 15 minutes";
    }
}

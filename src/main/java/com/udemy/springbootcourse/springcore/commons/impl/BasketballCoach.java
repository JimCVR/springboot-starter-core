package com.udemy.springbootcourse.springcore.commons.impl;

import com.udemy.springbootcourse.springcore.commons.interf.Coach;
import org.springframework.stereotype.Component;

// @Lazy creates the bean when needed
@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("Deploying: "+ this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise setplays for 30 minutes";
    }
}

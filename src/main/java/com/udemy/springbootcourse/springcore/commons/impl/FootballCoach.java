package com.udemy.springbootcourse.springcore.commons.impl;

import com.udemy.springbootcourse.springcore.commons.interf.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("Deploying: "+ this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise 20 penalty kick";
    }
}

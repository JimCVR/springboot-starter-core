package com.udemy.springbootcourse.springcore.controller;

import com.udemy.springbootcourse.springcore.commons.interf.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    //if there's only 1 constructor, Autowired is not required
    public DemoController(@Qualifier("basketballCoach") Coach coach) {
        this.coach = coach;
    }

    @PostConstruct
    public void onStart() {
        System.out.println("Business logic on start...");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Business logic on destroy...");
    }

    //Autowired annotation overrides constructor value when injecting dependencies
    @Autowired
    public void setterCoach(@Qualifier("swimCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/coach")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}

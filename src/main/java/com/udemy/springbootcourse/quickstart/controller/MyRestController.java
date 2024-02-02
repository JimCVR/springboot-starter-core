package com.udemy.springbootcourse.quickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyRestController {

    @Value("${course.web}")
    private String courseWeb;
    @Value("${course.student}")
    private String courseStudent;

    @GetMapping("/course")
    public Map<String, String> getCourseProperties() {
        var courseProperties = new HashMap<String, String>();
        courseProperties.put("name", courseWeb);
        courseProperties.put("student", courseStudent);
        return courseProperties;
    }

    @GetMapping("/")
    public String sayHello() {return "Hello world";}

    @GetMapping("/workout")
    public String getDailyWorkout() {return "Run a hard 5k";}
}

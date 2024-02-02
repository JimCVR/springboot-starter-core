package com.udemy.springbootcourse.springcore.commons.impl;

import com.udemy.springbootcourse.springcore.commons.interf.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 4 laps to warm up";
    }
}

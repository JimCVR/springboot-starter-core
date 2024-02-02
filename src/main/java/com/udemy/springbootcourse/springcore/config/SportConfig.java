package com.udemy.springbootcourse.springcore.config;

import com.udemy.springbootcourse.springcore.commons.impl.SwimCoach;
import com.udemy.springbootcourse.springcore.commons.interf.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}

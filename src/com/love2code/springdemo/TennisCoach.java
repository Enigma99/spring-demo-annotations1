package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

    // define a setter method for dependency injection
    @Autowired
    public void randomMeethodForDI(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService()");
        this.fortuneService = fortuneService;
    }
}

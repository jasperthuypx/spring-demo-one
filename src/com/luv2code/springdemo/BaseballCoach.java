package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    // step 2 create constructor for injection
    // field
    private FortuneService fortuneService;
    // constructor
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use fortune service to give fortune
        return fortuneService.getFortune();
    }
}



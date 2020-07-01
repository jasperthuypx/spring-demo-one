package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService theFortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}

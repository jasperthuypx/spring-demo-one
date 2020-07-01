package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    private CricketCoach() {
        System.out.println("Inside a constructor!");
    }

    @Override
    public String getDailyWorkout() {
        return "Make your cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "fortuneService=" + fortuneService +
                ", emailAddress='" + emailAddress + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}

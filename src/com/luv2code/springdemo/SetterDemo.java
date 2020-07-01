package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        // call methods on bean
        System.out.println(theCoach.getDailyWorkout() + "\n" + theCoach.getDailyFortune());
        System.out.println(theCoach);
        // close context
        context.close();
    }
}

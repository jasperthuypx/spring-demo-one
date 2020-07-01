package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext(
                "beanLifeCycle-applicationContext.xml"
        );

        var myCoach = context.getBean(Coach.class, "myCoach");

        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}

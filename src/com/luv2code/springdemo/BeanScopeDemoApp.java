package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // set context
        var context = new ClassPathXmlApplicationContext(
                "beanScope-applicationContext.xml");
        // retrieve bean

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        // use bean method

        System.out.println(theCoach == alphaCoach);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        // close context
        context.close();
    }
}

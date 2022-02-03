package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.Coach;

public class MyApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve bean from spring container
		Coach bbCoach = context.getBean("baseBallCoach", Coach.class);
		Coach ccCoach = context.getBean("cricketCoach", Coach.class);
		
		//call method on bean
		System.out.println(bbCoach.getDailyWorkout() +" "+ccCoach.getDailyWorkout());

		//close context
		context.close();
	}

}

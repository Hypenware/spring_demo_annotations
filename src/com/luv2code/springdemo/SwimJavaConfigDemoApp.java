package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read the spring config file
		AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext("SportConfig.class");
		//get the bean from spring container
		Coach theCoach = context.getBean("SwimCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}

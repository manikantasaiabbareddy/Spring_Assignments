package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("Coach",Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getFortune());
		
		JavaLanguage as1=context.getBean("Framework",JavaLanguage.class);
		System.out.println(as1.learningJava());
		System.out.println(as1.learningPython());
		context.close();
	}

}

package com.consultadd.SpringAssignment.SpringHelloWorld;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "I am on Cricket Class";
	}

}

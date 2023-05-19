package com.consultadd.SpringAssignment.SpringHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private Coach theCoach;
	
@Autowired
	public MyController(@Qualifier("cricketCoach") Coach theCoach) {
		this.theCoach = theCoach;
	}


	@GetMapping("helloworld")
	public String controller() {
		return "Hello World!";
	}
	
	@GetMapping("/ Cricket")
	public String getWorkOut() {
		return theCoach.getDailyWorkOut();
	}
}

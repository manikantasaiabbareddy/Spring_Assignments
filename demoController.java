package com.Consultadd.Assignment.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	
	@GetMapping("/readClass")
	public String readData(@RequestParam("name") String v) {
		return "Hello"+v;
	}
	
	@PostMapping("/postData")
	public String saveData(@RequestBody Student s) {
		System.out.println(s.Stu_Id);
		System.out.println(s.name);
		System.out.println(s.phone_number);
		return "store data";
	}
	

}

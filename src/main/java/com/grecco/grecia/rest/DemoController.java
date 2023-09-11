package com.grecco.grecia.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grecco.grecia.core.Coach;

@RestController
public class DemoController {
	
	private Coach myCoach;
	
	@Autowired
	public DemoController(Coach theCoach) {
		this.myCoach = theCoach;
	}
	
	@GetMapping("/dailyWorkout")
	public String dailyWorkout() {
		return myCoach.getDailyWorkout();
	}

}

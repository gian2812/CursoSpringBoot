package com.grecco.grecia.core.impl;

import org.springframework.stereotype.Component;

import com.grecco.grecia.core.Coach;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {	
		return "Practice for 15 minutes";
	}

}

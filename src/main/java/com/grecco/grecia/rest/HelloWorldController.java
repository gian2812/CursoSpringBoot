package com.grecco.grecia.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@GetMapping("/")
	public String index() {
		return "INDEX";
	}

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
    
    @GetMapping("/team")
    public String teamInfo(){
    	return  coachName + " es el coach de: " + teamName ;
    }
}
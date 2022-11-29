package com.andrea.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutes {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String greet() {
		return "Today you will find luck in all your endeavors!";
	
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	
	@RequestMapping("/travel/{track}")
	public String travel(@PathVariable ("track") String track) {
		return "Congratualtions! You will soon travel to " + track;
	
	}
	
	@RequestMapping("/lotto/{track}")
	public String lotto(@PathVariable int track) {
		if (track % 2 == 0) {
			return "You will take a grand journey in the near furure, but be wary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time with family and friends";
		}
	}

	

}

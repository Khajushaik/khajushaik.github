package com.appQ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {
	
	@GetMapping("/")
	public String home(){
		return "home";
	}
	@GetMapping("/resume")
	public String resume() {
		return "resume";
	}
	@GetMapping("/certificates")
	public String certificate() {
		return "certificates";
	}
	@GetMapping("/projects")
	public String projects() {
		return "project";
	}
	@GetMapping("/research")
	public String research() {
		return "research";
	}

	

}

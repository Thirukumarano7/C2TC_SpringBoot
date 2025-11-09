package com.tnsif.SpringBoot_RestControl_RestApi_8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String welcome(@RequestParam(value="name",defaultValue="Restcontrol") String name) {
		return "Welcome To "+name;
	}
	
	@GetMapping("/greet/{name}")
	public String Greet(@PathVariable String name) {
		return "Greeting "+name;
		
	}
}

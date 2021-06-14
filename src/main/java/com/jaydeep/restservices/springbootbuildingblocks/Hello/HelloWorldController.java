package com.jaydeep.restservices.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//@RequestMapping(method = RequestMethod.GET , path = "/helloworld")
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World 2";
	}
	@GetMapping("/hellobean")
	public UserDetails helloWorldBeans() {
		return new UserDetails("jay", "Raj", "Bhopal");
	}
}

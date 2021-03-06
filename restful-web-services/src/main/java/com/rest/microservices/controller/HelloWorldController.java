package com.rest.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.microservices.helloworld.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello")
	public String helloWorld() {
		return "Hello world>>>>>>!";
	}

	@GetMapping(path="/hellobean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path="/hellobean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World ,%s",name));
	}
}
 
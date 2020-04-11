package com.springbootdemo.controller;

import com.springbootdemo.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class GreetingsController {

	@Autowired
	private GreetingsService greetingsService;

	@GetMapping("/{name}")
	public String hello(@PathVariable("name") String name) {
		return greetingsService.hello(name);
	}
}

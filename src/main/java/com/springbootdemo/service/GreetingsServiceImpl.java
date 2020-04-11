package com.springbootdemo.service;

import com.springbootdemo.repository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService{

	@Autowired
	private GreetingsRepository greetingsRepository;

	@Override
	public String hello(String name) {
		return greetingsRepository.getMessage(name);
	}

}

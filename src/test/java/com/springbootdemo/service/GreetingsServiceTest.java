package com.springbootdemo.service;

import com.springbootdemo.repository.GreetingsRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class GreetingsServiceTest {

	@Mock
	GreetingsRepository greetingsRepository;
	@InjectMocks  //auto inject GreetingsRepository
	private GreetingsService greetingsService = new GreetingsServiceImpl();
	private String message = "Hello Mock Repository!";

	@BeforeEach
	void setupMock(){
		when(greetingsRepository.getMessage(Mockito.anyString())).thenReturn(message);
	}

	void testHello(){
		assertEquals(message, greetingsService.hello("mock"));
	}
}

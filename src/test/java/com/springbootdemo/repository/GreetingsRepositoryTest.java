package com.springbootdemo.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingsRepositoryTest {

    private static GreetingsRepository greetingsRepository;
    private static String name;

    @BeforeAll
    static void setUp() {
        greetingsRepository = new GreetingsRepositoryImpl();
        name = "Deepak";
    }

    @DisplayName("Testing Repository Method")
    @Test
    void testGetMessage() {
        assertEquals("Hello Deepak!", greetingsRepository.getMessage(name));
    }
}

package com.springbootdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingsRepositoryImpl implements GreetingsRepository{

    @Override
    public String getMessage(String name) {
        return "Hello "+ name+"!";
    }
}

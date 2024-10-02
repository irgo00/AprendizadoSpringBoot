package com.aprendendospringboot.AprendizadoSpringBoot.service;

import org.springframework.stereotype.Service;

@Service //informa que a classe é Service
public class HelloWorldService {
    public String helloWorld(String nome) {
        return "Hello World!" + nome;
    }
}

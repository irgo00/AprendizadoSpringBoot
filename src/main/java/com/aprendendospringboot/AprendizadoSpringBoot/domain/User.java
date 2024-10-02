package com.aprendendospringboot.AprendizadoSpringBoot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//faz o lombok gerar automaticamente os getters, setters e construtor da classe
public class User {
    private String name;
    private String email;

}

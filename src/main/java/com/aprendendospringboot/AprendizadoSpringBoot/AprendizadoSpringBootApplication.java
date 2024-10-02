package com.aprendendospringboot.AprendizadoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //define aonde o Spring Boot deve inicializar
//possui 3 anotações embutidas: @Configuration, @EnableAutoConfiguration, @ComponentScan

//@Configuration: define que a classe possui métodos que definem bins
//@EnableAutoConfiguration: permite a auto-configuração do Spring Boot, fazendo configurações padrões para nós não nos preocuparmos com isso
//@ComponentScan: permite que o Spring escaneie todo o pacote em busca de todos os componentes

public class AprendizadoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendizadoSpringBootApplication.class, args);
	}

}

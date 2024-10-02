package com.aprendendospringboot.AprendizadoSpringBoot.controller;

import com.aprendendospringboot.AprendizadoSpringBoot.domain.User;
import com.aprendendospringboot.AprendizadoSpringBoot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //indica que a classe é um controller rest (possui @Controller e @ResponseBody embutidas)
@RequestMapping("/hello-world") //a classe escuta todas as requisições que chegarem no endpoint /hello-world
public class HelloWorldController {

    @Autowired //METODO 2: criando um @AutoWired, indicando que a dependência abaixo deve ser injetada
    private HelloWorldService helloWorldService;

    //METODO 1: criando um construtor:
//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping //a função escuta pelo metodo GET (pode passar outro caminho como parâmetro)
    public String helloWorld(){
        return helloWorldService.helloWorld("Igor");
    }

    @PostMapping("/{id}") //pegar um id que foi passado pela url
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value="filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World " + body.getName() + id + filter;
    }
}

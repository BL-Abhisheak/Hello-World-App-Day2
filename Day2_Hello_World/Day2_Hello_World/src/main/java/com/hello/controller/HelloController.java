package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.dto.HelloDTO;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bridgelabz...";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "Hello " + name + " from Bridgelabz...";

    }

    @PostMapping("/hello")
    public String hello(@RequestBody HelloDTO nameDTO) {
     return "Hello " + nameDTO.getFname() + " " + nameDTO.getLname() + " from Bridgelabz...";
}



    // @GetMapping("/web/hello")
    // public String webhello(){
    //     return "hello";
    // }
}

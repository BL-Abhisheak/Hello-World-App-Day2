package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    // @GetMapping("/hello")
    // public String hello(){
    //     return "Hello World";
    // }


    @GetMapping("/web/hello")
    public String webhello(){
        return "hello";
    }
}

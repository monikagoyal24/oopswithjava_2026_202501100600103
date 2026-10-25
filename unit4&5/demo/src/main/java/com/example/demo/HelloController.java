package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("bye")
    public String greetBye(){
        return "<h1>Bye</h1>";
    }
}

package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Hello World API 제작
@RestController
public class HelloController {

    @GetMapping("/API/hello")
    public String hello() {
        return "Hello World";
    }
}

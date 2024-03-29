package com.luv2code.restdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/test"})
public class DemoRestController {

    @GetMapping({"/hello", "/hello.html"})
    public String sayHello() {
        return "Hello World!";
    }
}

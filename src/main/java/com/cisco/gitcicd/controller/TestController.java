package com.cisco.gitcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tests")
public class TestController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "Welcome to the CI/CD";
    }
}

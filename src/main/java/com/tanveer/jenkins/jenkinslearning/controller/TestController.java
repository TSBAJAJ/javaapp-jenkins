package com.tanveer.jenkins.jenkinslearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}

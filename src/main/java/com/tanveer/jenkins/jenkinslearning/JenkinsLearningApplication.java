package com.tanveer.jenkins.jenkinslearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsLearningApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsLearningApplication.class, args);
        System.out.println("application started");
        System.out.println("thread completed");
    }

}

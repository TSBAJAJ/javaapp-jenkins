package com.tanveer.jenkins.jenkinslearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsLearningApplication.class, args);
        System.out.println("application started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread completed");
        System.exit(0);
    }

}

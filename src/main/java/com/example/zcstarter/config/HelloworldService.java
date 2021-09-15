package com.example.zcstarter.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class HelloworldService implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sayHello();
    }

    public void sayHello() {
        System.out.println("Hello world");
    }
}

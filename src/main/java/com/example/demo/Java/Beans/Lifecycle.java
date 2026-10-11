package com.example.demo.Java.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lifecycle {

    private DTY dty;

    public Lifecycle(DTY dty) {
        this.dty = dty;
        System.out.println("1. Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. Initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3. Destruction");
    }
}

//constructor
//dependency injection
//initialization
//destruction
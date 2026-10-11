package com.example.demo.Java.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//matlb 2 service class hai aur isme service1, service2 ko and service2, service1 ko call krta hai to
//isko circular dependency kehte hai na?

@Service
class A {
    @Autowired
    private B b;
}

@Service
class B {
    @Autowired
    private A a;
}


//overcome krne ke liye
/*
@Lazy

@Service
class A {
    @Autowired
    @Lazy
    private B b;
}

@Service
class B {
    @Autowired
    private A a;
}
 */
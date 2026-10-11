package com.example.demo.Java.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class BeanScope {
}

//1. Singleton Scope — Default
//Ek Spring IoC Container mein ek bean definition ka ek shared instance.
@Component
@Scope("singleton")
class SingletonBean {
    public SingletonBean() {
        System.out.println("Singleton Created");
    }
}

//2. Prototype Scope
//Har baar Spring se bean ka naya instance request karne par naya object milta hai.
@Component
@Scope("prototype")
class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Prototype Created");
    }
}

//3. Request Scope — HTTP Request
//Har HTTP request ke liye alag bean instance.
@Component
@Scope("request")
class RequestBean {

    public RequestBean() {
        System.out.println("Request Bean Created");
    }
}

//4. Session Scope — HTTP Session
//Har HTTP session ke liye alag bean instance.
@Component
@Scope("session")
class SessionBean {

    public SessionBean() {
        System.out.println("Session Bean Created");
    }
}

//5. Application Scope
//Ek web application ke ServletContext ke liye ek bean instance.
@Component
@Scope("application")
class ApplicationBean {

    public ApplicationBean() {
        System.out.println("Application Bean Created");
    }
}
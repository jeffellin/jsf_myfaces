package com.demo.jsf;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "helloWorld", eager = true)
@Component("helloBean")
@Scope("request")
public class HelloWorld {

    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public HelloWorld() {
        System.err.println("HelloWorld started!");
        greeting = "Hello There";
    }

    public String getMessage() {


        return greeting;
    }

}
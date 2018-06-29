package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.model.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public Greeting sayHello() {
        return new Greeting();
    }

    @RequestMapping("/{name}")
    public Greeting sayHello(@PathVariable("name") String name) {
        return new Greeting(name);
    }

}

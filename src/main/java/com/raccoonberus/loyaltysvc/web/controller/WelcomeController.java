package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.domain.Greeting;
import com.raccoonberus.loyaltysvc.domain.Type;
import com.raccoonberus.loyaltysvc.service.CodeService;
import com.raccoonberus.loyaltysvc.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("/")
    public Greeting sayHello() {
        typeService.create(new Type().setName("TEst 1").setDescription("Wildfowl"));
        return new Greeting();
    }

    @RequestMapping("/{name}")
    public Greeting sayHello(@PathVariable("name") String name) {
        return new Greeting(name);
    }

}

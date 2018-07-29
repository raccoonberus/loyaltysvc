package com.raccoonberus.loyaltysvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping
    @ResponseBody
    public String homepage() {
        return "<html>" +
                "<head>" +
                "   <title>Loyalty SVC</title>" +
                "</head>" +
                "<body>" +
                "   <h1>Welcome to Loyalty SVC</h1>" +
                "</body>" +
                "</html>";
    }

}

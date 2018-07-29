package com.raccoonberus.loyaltysvc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@Configuration
//@EnableAutoConfiguration
//@SpringBootApplication()
public class WebInitializer
        extends SpringBootServletInitializer {

//    public static void main(String[] args) {
//        SpringApplication.run(WebInitializer.class, args);
//    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}

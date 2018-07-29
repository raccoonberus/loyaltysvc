package com.raccoonberus.loyaltysvc.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {
        "com.raccoonberus.loyaltysvc.web.controller",
})
public class WebConfig implements WebMvcConfigurer {
}

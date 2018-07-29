package com.raccoonberus.loyaltysvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:datasource.properties"),
        @PropertySource(value = "file:${user.home}/.loyaltysvc/datasource.properties", ignoreResourceNotFound = true)
})
@ComponentScan(basePackages = {
        "com.pbt.bssystem.cashier.pc.dao"
})
public class HibernateConfig {
}

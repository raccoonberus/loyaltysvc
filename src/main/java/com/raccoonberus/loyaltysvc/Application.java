package com.raccoonberus.loyaltysvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
        scanBasePackages = {"com.raccoonberus.loyaltysvc"}
)
@EnableScheduling()
@EnableJpaAuditing
@EnableTransactionManagement
@EntityScan("com.raccoonberus.loyaltysvc.domain")
@EnableJpaRepositories(value = "com.raccoonberus.loyaltysvc.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package com.raccoonberus.loyaltysvc;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.dao.test.CodeDaoImpl;
import org.springframework.context.annotation.*;

@Configuration
@Import(Application.class)
@Profile("test")
public class TestConfig {

    @Bean
    @Primary
    public CodeDao getCodeDao()
    {
        return new CodeDaoImpl();
    }

}

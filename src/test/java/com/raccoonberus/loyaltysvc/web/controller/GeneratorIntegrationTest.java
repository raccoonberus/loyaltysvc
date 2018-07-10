package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.domain.Type;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GeneratorIntegrationTest extends BaseIntegration {

    @Autowired
    private TypeDao typeDao;

    @Test
    public void generate() throws Exception {
        typeDao.save(
                new Type()
                        .setName("30-days-discount")
                        .setDescription("Some test code's type.")
        );

        mockMvc
                .perform(
                        post("/code/generate")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "    \"strategy\": \"CustomerPersonalCode-4-letter-6-digits\",\n" +
                                        "    \"type\": \"30-days-discount\",\n" +
                                        "    \"quantity\": 10\n" +
                                        "}")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ok").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(10))
        ;
    }

}

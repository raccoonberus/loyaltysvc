package com.raccoonberus.loyaltysvc.rest.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TypeControllerIntegrationTest extends BaseIntegration {

    @Test
    public void createAndGet() throws Exception {
        this.mockMvc
                .perform(post("/api/type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"id\": \"test-type\",\n" +
                                "    \"description\": \"\",\n" +
                                "    \"validFrom\": \"\",\n" +
                                "    \"validTill\": \"\",\n" +
                                "    \"value\": 2000\n" +
                                "}"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.ok")
                        .value(true))
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.result")
                        .value(123456))
                .andReturn();

        this.mockMvc
                .perform(get("/type"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.ok")
                        .value(true))
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.result[0].id")
                        .value("test-type"))
                .andReturn();
    }

}

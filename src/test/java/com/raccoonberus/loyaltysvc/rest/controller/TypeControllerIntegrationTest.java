package com.raccoonberus.loyaltysvc.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raccoonberus.loyaltysvc.rest.model.Response;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TypeControllerIntegrationTest extends BaseIntegration {

    @Test
    public void createAndGet() throws Exception {
        MvcResult res = this.mockMvc
                .perform(post("/api/type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"name\": \"test-type\",\n" +
                                "    \"description\": \"Hello, API!\",\n" +
                                "    \"validFrom\": \"\",\n" +
                                "    \"validTill\": \"\",\n" +
                                "    \"value\": 2000\n" +
                                "}"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.ok")
                        .value(true))
//                .andExpect(MockMvcResultMatchers
//                        .jsonPath("$.result")
//                        .value(123456))
                .andReturn();
        String response = res.getResponse().getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        Response resp = mapper.readValue(response, Response.class);

        this.mockMvc
                .perform(get("/api/type/" + resp.getResult().toString()))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.ok")
                        .value(true))
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.result.description")
                        .value("Hello, API!"))
                .andReturn();
    }

}

package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.model.Code;
import com.raccoonberus.loyaltysvc.model.Type;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CodeControllerIntegrationTest extends BaseIntegrationTest {

//    @Autowired
//    private TestEntityManager entityManager;

    @Autowired
    private CodeDao codeDao;

    @Autowired
    private TypeDao typeDao;

    @Test
    public void generate() throws Exception {
        typeDao.saveAndFlush(
                new Type().setName("30-days-discount").setDescription("Some test code's type.")
        );

        mockMvc.perform(
                post("/api/code/generate")
                        .content("{\n" +
                                "        \"strategy\": \"CustomerPersonalCode-4-letter-6-digits\",\n" +
                                "        \"type\": \"30-days-discount\",\n" +
                                "        \"quantity\": 10\n" +
                                "    }")
        )
                .andExpect(MockMvcResultMatchers.jsonPath("$.ok").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(10))
        ;
    }

    @Test
    public void codeActivation() throws Exception {

        String codeName = "qwerty";

        codeDao.saveAndFlush(new Code().setName(codeName));

        this.mockMvc.perform(
                put("/api/code/activate")
                        .content("{\"code\": \"" + codeName + "\"}")
        )
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ok").value(true));
    }

}

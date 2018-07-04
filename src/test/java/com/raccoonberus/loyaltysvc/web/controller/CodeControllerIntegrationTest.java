package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.domain.Code;
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

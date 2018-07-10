package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.domain.Code;
import com.raccoonberus.loyaltysvc.domain.Type;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CodeControllerIntegrationTest extends BaseIntegration {

    @Autowired
    private TypeDao typeDao;

    @Autowired
    private CodeDao codeDao;

    @Test
    public void codeActivation() throws Exception {

        Type type = new Type().setName("Some type").setValue(1000);
        typeDao.save(type);

        String codeName = "qwerty";
        Code code = new Code().setName(codeName).setType(type);
        codeDao.save(code);

        this.mockMvc.perform(
                post("/api/code/activate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"code\": \"" + codeName + "\"}")
        )
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ok").value(true));
    }

}

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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CodeControllerIntegrationTest extends BaseIntegration {

    @Autowired
    private TypeDao typeDao;

    @Autowired
    private CodeDao codeDao;

    @Test
    public void codeActivation_negative() throws Exception {
        this.mockMvc
                .perform(
                        post("/code/activate")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "    \"username\": \"some_unreal_nonexistent_super_secret_username_or_nickName\", \n" +
                                        "    \"code\": \"some_nonexistent_code\"\n" +
                                        "}")
                )
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error.messages").isArray())
        ;
    }

    @Test
    public void codeActivation() throws Exception {

        Type type = new Type().setName("Some type").setValue(1000);
        typeDao.save(type);

        String codeName = "qwerty";
        Code code = new Code().setName(codeName).setType(type);
        codeDao.save(code);

        this.mockMvc
                .perform(
                        post("/code/activate")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "    \"username\": \"ivanov234\", \n" +
                                        "    \"code\": \"" + codeName + "\"\n" +
                                        "}")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ok").value(true));
    }

}

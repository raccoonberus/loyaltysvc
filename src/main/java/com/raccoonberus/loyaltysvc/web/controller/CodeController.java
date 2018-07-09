package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.service.CodeService;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/code")
public class CodeController {

    private CodeService codeService;

    @PostMapping(value = "/activate")
    public Response activate(String codeName) {
        return new Response(true, codeName);
    }

}

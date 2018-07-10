package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.web.model.ActivationData;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/code")
public class CodeController {

    @PostMapping(value = "/activate")
    public Response activate(@RequestBody ActivationData data) throws Exception {
        throw new Exception("Code is not exists");
    }

}

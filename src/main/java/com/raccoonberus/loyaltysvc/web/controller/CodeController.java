package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.web.exception.ApiException;
import com.raccoonberus.loyaltysvc.web.model.ActivationData;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("code")
public class CodeController {

    @PostMapping(value = "activate")
    public Response activate(@RequestBody ActivationData data) throws ApiException {
        throw new ApiException("Code is not exists");
    }

}

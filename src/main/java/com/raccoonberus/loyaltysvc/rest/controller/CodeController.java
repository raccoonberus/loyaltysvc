package com.raccoonberus.loyaltysvc.rest.controller;

import com.raccoonberus.loyaltysvc.rest.exception.ApiException;
import com.raccoonberus.loyaltysvc.rest.model.ActivationData;
import com.raccoonberus.loyaltysvc.rest.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/code")
public class CodeController {

    @PostMapping(value = "activate")
    public Response activate(@RequestBody ActivationData data) throws ApiException {
        throw new ApiException("Code is not exists");
    }

}

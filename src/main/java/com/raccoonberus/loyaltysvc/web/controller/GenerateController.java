package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.web.exception.ApiException;
import com.raccoonberus.loyaltysvc.web.model.GenerateOpenTask;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generate")
public class GenerateController {

    @PostMapping
    public Response openTask(@RequestBody GenerateOpenTask task) throws ApiException {
        throw new ApiException("Strategy not found!");
    }

}

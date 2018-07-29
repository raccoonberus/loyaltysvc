package com.raccoonberus.loyaltysvc.rest.controller;

import com.raccoonberus.loyaltysvc.rest.exception.ApiException;
import com.raccoonberus.loyaltysvc.rest.model.GenerateOpenTask;
import com.raccoonberus.loyaltysvc.rest.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generate")
public class GenerateController {

    @PostMapping
    public Response openTask(@RequestBody GenerateOpenTask task) throws ApiException {
        throw new ApiException("Strategy not found!");
    }

}

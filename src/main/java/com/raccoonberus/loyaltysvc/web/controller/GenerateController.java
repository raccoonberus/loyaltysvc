package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.web.model.GenerateOpenTask;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/generate")
public class GenerateController {

    public Response openTask(@RequestBody GenerateOpenTask task) throws Exception {
        throw new Exception("Strategy not found!");
    }

}

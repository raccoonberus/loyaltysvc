package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.domain.Type;
import com.raccoonberus.loyaltysvc.service.TypeService;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping
    public Response create(@RequestBody @Valid Type type) {
        typeService.create(type);
        return new Response(true, null);
    }

    @GetMapping
    public Response getAll() { // TODO: realize pagination
        return new Response(true,
                typeService.getAll());
    }
}

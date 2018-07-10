package com.raccoonberus.loyaltysvc.web.controller;

import com.raccoonberus.loyaltysvc.domain.Type;
import com.raccoonberus.loyaltysvc.service.TypeService;
import com.raccoonberus.loyaltysvc.web.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController("/type")
public class TypeController {

    @PostMapping
    public Response create(@RequestBody @Valid Type type) throws Exception {
        throw new Exception("Type not found!");
    }

    @PutMapping
    public Response update(@RequestBody @Valid Type type) throws Exception {
        throw new Exception("Type not found!");
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Long id) throws Exception {
        throw new Exception("Type not found!");
    }

    @DeleteMapping("/{id}/deactivate")
    public Response deactivate(@PathVariable Long id) {
        return new Response(true, null);
    }

    @GetMapping
    public Response get() {
        List<Type> result = new ArrayList<>();
        result.add(new Type().setId(1));
        result.add(new Type().setId(2));
        result.add(new Type().setId(3));
        return new Response(true, result);
    }

    @GetMapping("/{id}")
    public Response get(@PathVariable Long id) {
        Type result = new Type().setId(id);
        return new Response(true, result);
    }

    @GetMapping("/{name}")
    public Response get(@PathVariable String name) {
        Type result = new Type().setId(123).setName(name);
        return new Response(true, result);
    }

}

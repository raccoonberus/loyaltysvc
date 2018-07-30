package com.raccoonberus.loyaltysvc.rest.controller;

import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.domain.Type;
import com.raccoonberus.loyaltysvc.rest.exception.ApiException;
import com.raccoonberus.loyaltysvc.rest.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/type")
public class TypeController {

    @Autowired
    private TypeDao typeDao;

    @PostMapping
    public Response create(@RequestBody @Valid Type type) throws ApiException {
        typeDao.save(type);
        return new Response(true, type.getId());
    }

    @PutMapping
    public Response update(@RequestBody @Valid Type type) throws ApiException {
        throw new ApiException("Type not found!");
    }

    @DeleteMapping("{id:[0-9]+}")
    public Response delete(@PathVariable Long id) throws ApiException {
        throw new ApiException("Type not found!");
    }

    @DeleteMapping("{id:[0-9]+}/deactivate")
    public Response deactivate(@PathVariable Long id) throws ApiException {
        throw new ApiException("Type not found!");
    }

    @RequestMapping(value = "{id:[0-9]+}", method = RequestMethod.GET)
    public Response get(@PathVariable Long id) throws ApiException {
        Type type = typeDao.find(id);
        return new Response(true, type);
    }

    @RequestMapping(value = "{name:[a-zA-Z]+}", method = RequestMethod.GET)
    public Object get(@PathVariable("name") String name, Model model) throws ApiException {
        throw new ApiException("Type not found for specified name!");
//        return new ExceptionResponse();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Response get() {
        List<Type> result = new ArrayList<>();
        result.add(new Type().setId(1));
        result.add(new Type().setId(2));
        result.add(new Type().setId(3));
        return new Response(true, result);
    }

}

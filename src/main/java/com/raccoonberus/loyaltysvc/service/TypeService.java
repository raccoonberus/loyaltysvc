package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.model.Type;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeService {

    void create(Type type);

    List<Type> getAll();
}

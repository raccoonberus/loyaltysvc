package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.domain.Type;

import java.util.List;

public interface TypeService {

    void create(Type type);

    List<Type> getAll();
}

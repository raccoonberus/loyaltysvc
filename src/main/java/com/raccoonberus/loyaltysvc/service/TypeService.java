package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.domain.Type;

import java.util.List;

public interface TypeService {

    Type find(Long id);

    void create(Type type);

    void update(Type type);

    void delete(Type type);

    void delete(Long id);

    void deactivate(Long id);
}

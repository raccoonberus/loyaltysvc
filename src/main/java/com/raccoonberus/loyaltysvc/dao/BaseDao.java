package com.raccoonberus.loyaltysvc.dao;

import java.io.Serializable;

public interface BaseDao<T> {

    void create(T entity);

    T read(Serializable id);

    void update(T entity);

    void delete(T entity);

}

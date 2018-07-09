package com.raccoonberus.loyaltysvc.dao;

public interface BaseDao<T, ID> {

    void save(T entity);

    void update(T entity);

    void remove(T entity);
}

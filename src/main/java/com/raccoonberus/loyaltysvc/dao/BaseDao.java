package com.raccoonberus.loyaltysvc.dao;

public interface BaseDao<T, ID> {

    T find(ID id);

    void save(T entity);

    void update(T entity);

    void remove(T entity);
}

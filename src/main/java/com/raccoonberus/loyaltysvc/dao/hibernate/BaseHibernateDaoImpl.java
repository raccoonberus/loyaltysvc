package com.raccoonberus.loyaltysvc.dao.hibernate;

import com.raccoonberus.loyaltysvc.dao.BaseDao;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseHibernateDaoImpl<T, ID> implements BaseDao<T, ID> {

    protected Class<T> persistanceClass;

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public void update(T entity) {
        em.merge(entity);
    }

    @Override
    public void remove(T entity) {
        em.remove(entity);
    }
}

package com.raccoonberus.loyaltysvc.dao.jpa;

import com.raccoonberus.loyaltysvc.dao.BaseDao;
import org.springframework.core.GenericTypeResolver;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseHibernateDaoImpl<T, ID> implements BaseDao<T, ID> {

    protected Class<T> persistenceClass;

    @PersistenceContext
    private EntityManager em;

    public BaseHibernateDaoImpl() {
//        this.persistenceClass = (Class<T>) GenericTypeResolver
//                .resolveTypeArgument(
//                        getClass().getSuperclass(),
//                        BaseHibernateDaoImpl.class
//                );

        if (persistenceClass == null) {
            Type mySuperclass = getClass().getGenericSuperclass();
            Type tType = ((ParameterizedType) mySuperclass).getActualTypeArguments()[0];
            String className = tType.toString().split(" ")[1];
            try {
                persistenceClass = (Class<T>) Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public T find(ID id) {
        return em.find(persistenceClass, id);
    }

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

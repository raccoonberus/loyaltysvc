package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.domain.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Override
    public Type find(Long id) {
        return typeDao.find(id);
    }

    @Override
    public void create(Type type) {
        typeDao.save(type);
    }

    @Override
    public void update(Type type) {
        typeDao.update(type);
    }

    @Override
    public void delete(Type type) {
        typeDao.remove(type);
    }

    @Override
    public void delete(Long id) {
        Type t = typeDao.find(id);
        typeDao.remove(t);
    }

    @Override
    public void deactivate(Long id) {
        Type t = typeDao.find(id);
        t.setActive(false);
        typeDao.update(t);
    }
}

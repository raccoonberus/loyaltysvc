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
    public void create(Type type) {
        typeDao.save(type);
    }

    @Override
    public List<Type> getAll() {
        return null;
    }
}

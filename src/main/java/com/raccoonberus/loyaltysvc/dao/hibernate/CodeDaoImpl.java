package com.raccoonberus.loyaltysvc.dao.hibernate;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.domain.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CodeDaoImpl extends SimpleJpaRepository<Code, Long> implements CodeDao {

    @Autowired
    public CodeDaoImpl(EntityManager em) {
        super(Code.class, em);
    }

    @Override
    public Code get(String name) {
        return null;
    }

}

package com.raccoonberus.loyaltysvc.dao.jpa;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.domain.Code;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDaoImpl
        extends BaseHibernateDaoImpl<Code, Long>
        implements CodeDao {

    @Override
    public Code get(String name) {
        return null;
    }

}

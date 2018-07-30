package com.raccoonberus.loyaltysvc.dao.jpa;

import com.raccoonberus.loyaltysvc.dao.TypeDao;
import com.raccoonberus.loyaltysvc.domain.Type;
import org.springframework.stereotype.Repository;

@Repository
public class TypeDaoImpl
        extends BaseHibernateDaoImpl<Type, Long>
        implements TypeDao {
}

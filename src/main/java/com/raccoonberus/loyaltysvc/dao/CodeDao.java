package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.model.Code;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao extends BaseDao<Code> {

    Code get(String name);

}

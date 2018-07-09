package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao extends BaseDao<Code, Long> {

    Code get(String name);

}

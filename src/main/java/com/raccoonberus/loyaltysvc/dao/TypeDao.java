package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDao extends BaseDao<Type, Long> {

    //

}

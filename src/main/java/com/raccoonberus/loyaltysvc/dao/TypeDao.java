package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.model.Code;
import com.raccoonberus.loyaltysvc.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDao extends JpaRepository<Type, Long> {

    //

}

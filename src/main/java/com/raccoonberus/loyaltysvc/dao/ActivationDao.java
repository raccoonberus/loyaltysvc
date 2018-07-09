package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Account;
import com.raccoonberus.loyaltysvc.domain.Activation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;
import java.util.List;

@NoRepositoryBean
public interface ActivationDao extends BaseDao<Activation, Long> {

    List<Activation> getByPeriod(Date since);

    List<Activation> getByPeriod(Date since, Date to);

    List<Activation> getByPeriod(Account account, Date since);

    List<Activation> getByPeriod(Account account, Date since, Date to);

}

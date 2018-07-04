package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Account;
import com.raccoonberus.loyaltysvc.domain.Activation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ActivationDao extends JpaRepository<Activation, Long> {

    List<Activation> getByPeriod(Date since);

    List<Activation> getByPeriod(Date since, Date to);

    List<Activation> getByPeriod(Account account, Date since);

    List<Activation> getByPeriod(Account account, Date since, Date to);

}

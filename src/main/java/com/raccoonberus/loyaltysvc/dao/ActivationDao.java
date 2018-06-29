package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.model.Account;
import com.raccoonberus.loyaltysvc.model.Activation;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ActivationDao extends BaseDao<Activation> {

    List<Activation> getByPeriod(Date since);

    List<Activation> getByPeriod(Date since, Date to);

    List<Activation> getByPeriod(Account account, Date since);

    List<Activation> getByPeriod(Account account, Date since, Date to);

}

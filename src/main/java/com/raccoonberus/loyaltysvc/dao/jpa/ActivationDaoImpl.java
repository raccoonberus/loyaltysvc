package com.raccoonberus.loyaltysvc.dao.jpa;

import com.raccoonberus.loyaltysvc.dao.ActivationDao;
import com.raccoonberus.loyaltysvc.domain.Account;
import com.raccoonberus.loyaltysvc.domain.Activation;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ActivationDaoImpl
        extends BaseHibernateDaoImpl<Activation, Long>
        implements ActivationDao {

    @Override
    public List<Activation> getByPeriod(Date since) {
        return null;
    }

    @Override
    public List<Activation> getByPeriod(Date since, Date to) {
        return null;
    }

    @Override
    public List<Activation> getByPeriod(Account account, Date since) {
        return null;
    }

    @Override
    public List<Activation> getByPeriod(Account account, Date since, Date to) {
        return null;
    }

}

package com.raccoonberus.loyaltysvc.dao.hibernate;

import com.raccoonberus.loyaltysvc.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

@Repository
public class AccountDao extends SimpleJpaRepository<Account, Long>
        implements com.raccoonberus.loyaltysvc.dao.AccountDao {

    @Autowired
    public AccountDao(EntityManager em) {
        super(Account.class, em);
    }

    @Override
    public Account getByUsername(String username) {
        return null;
    }

    @Override
    public void doBlockTill(Account account, Date dateTill) {}

    @Override
    public List<Account> inBlockedPeriodNow(int limit) {
        return null;
    }
}

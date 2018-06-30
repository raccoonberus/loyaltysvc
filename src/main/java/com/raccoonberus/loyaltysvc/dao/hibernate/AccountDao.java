package com.raccoonberus.loyaltysvc.dao.hibernate;

import com.raccoonberus.loyaltysvc.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

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
    public void block(Account account) {

    }

    @Override
    public List<Account> getBlocked(int limit) {
        return null;
    }
}
